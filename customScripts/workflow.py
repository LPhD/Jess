#!/usr/bin/env python3
from octopus.server.DBInterface import DBInterface
import subprocess
import os
import shutil
import re

#### Helper functions ###

# Sometimes Git messes ob the matching of brackets (identifies similar lines), we need to reverse that
def fixBrackets(patch):
    for index,line in enumerate(patch):
        # Check for lines that contain only brackets
        if re.match("^((\s*\n*[}{()]\s*\n*)+)$", line):
            patch[index] = "+" + line

    return patch

# Add the patch content to the respective file   
def assemblyTargetFile(filePath):    
    fileContent = []
    lasNewline = False
    found = False
    start = True
    
    fileContent.append("/* * * This is the beginning of the automated transplanted code * * */") 
    fileContent.append("\n")  
    
    # Write content to variable, without double newlines
    with open(topLvlDir+"/"+resultFoldername+"/Target/"+filePath, 'r') as file:
        for line in file:
            if line.startswith("\n"):    
                lasNewline = True               
            else:               
                # Just add single newlines to the file
                if lasNewline:
                   fileContent.append("\n")
                   lasNewline = False
                # Add the file content   
                fileContent.append(line)
                
    # Always end newlines and a comment           
    fileContent.append("\n")  
    fileContent.append("/* * * This is the end of the automated transplanted code * * */")     
    fileContent.append("\n") 
    
    # Read patch content (do this here because we do not want to have the whole patch in the memory all the time)
    with open(topLvlDir+"/"+resultFoldername+"/patch.patch", 'r') as patch:
        for line in patch:
            # Look for the part of the patch that belongs to the file
            if line.startswith("--- b/"+filePath):
                found = True 
                
            if start and not line.startswith("diff --git"):
                # Here is the patch content for the current file
                fileContent.append(line.replace("+","",1))
            elif line.startswith("diff --git"):
                # Reset if we reach the beginning of a new header
                found = False
                start = False
                
            # Patch content begins after the @@    
            if found:
                if line.startswith("@@"):
                    start = True
    
   
    # Write assembled content to file
    file = open(topLvlDir+"/"+resultFoldername+"/Target/"+filePath, 'w')   
    file.write("".join(fileContent))
    file.close()

 
# Returns the file names of all files that are affected by changes
def getTargetFiles(patch, files):
    # Search for filenames
    with open(patch, 'r') as file:
        for line in file:
            if line.startswith("---"):
                files.append(line.split("b/",1)[1].replace("\n",""))

    return files
    
#### Helper functions end ###

# Get current path
topLvlDir = os.getcwd()
# Add folder to work with
resultFoldername = "Results"

print(" ### Welcome to the interactive code migration workflow ### ")
print(" ### Prerequisite 1: Version control with Git ### ")
print(" ### Prerequisite 2: Jess server is (re-)started before running the script ### ")

#Import new branches or reuse old ones?
reuse = input("Would you like to work with a new project (1) or keep the last one (2) ?\n")


if (reuse == "1"):
    
    # Delete old results
    if os.path.exists(resultFoldername):
        shutil.rmtree(resultFoldername)
    os.makedirs(resultFoldername)

    print(" ### Results are stored in the *"+resultFoldername+"* folder ### ")

    # Get donor
    donorRepoURL = input("Please type in the url to the Git repository containing the desired functionality (without additional information) \n")
    #donorRepoURL = "https://github.com/LPhD/EvoDiss.git"
    print("Set donor repo to: "+donorRepoURL+".")
    donorBranch = input("Please type in the name of the branch that contains the functionality you would like to merge (donor branch) \n")
    #donorBranch = "OnlyBubble"
    print("Set donor branch to: "+donorBranch+".")
    os.system("git clone -b "+donorBranch+" "+donorRepoURL+" "+resultFoldername+"/Donor")  


    # Get target
    targetRepoURL = input("\nPlease type in the url to the Git repository where you would like to add the functionality (without additional information) \n")
    #targetRepoURL = "https://github.com/LPhD/EvoDiss.git"
    print("Set target repo to: "+targetRepoURL+".")
    targetBranch = input("Please type in the name of the branch you would like to merge into (target branch) \n")
    #targetBranch = "Base_PL"
    print("Set target branch to: "+targetBranch+".")
    os.system("git clone -b "+targetBranch+" "+targetRepoURL+" "+resultFoldername+"/Target") 


    # Get origin (common ancestor)
    originRepoURL = input("\nPlease type in the url to the Git repository containing the common ancestor of donor and target (without additional information) \n")
    #originRepoURL = "https://github.com/LPhD/EvoDiss.git"
    print("Set origin repo to: "+originRepoURL+".")
    originCommitID = input("Please type in the commit ID of the commit that marks the last version before donor and target diverged (origin) \n")
    #originCommitID = "cbaaa929cd2b646cfd332ea753543e08a405bc4b"
    print("Set common ancestor (origin) to: "+originCommitID+".")
    os.system("git clone "+originRepoURL+" "+resultFoldername+"/Origin")  
    # Change current working directory to origin
    os.chdir(topLvlDir+"/"+resultFoldername+"/Origin")
    os.system("git checkout "+originCommitID) 

     
    # Import donor as CPG
    print(" ### Start importing donor as Code Property Graph. Please make sure the server is running ### ")
    os.chdir(topLvlDir+"/"+resultFoldername)
    os.system("tar -cvzf DonorProject Donor") 
    os.system("jess-import DonorProject") 


    # Validate CPG
    print(" ### Validating CPG ### ")
    os.chdir(topLvlDir)
    from evaluation import evaluateProject
    evaluateProject("DonorProject", "/Donor/")


# Identify SU
print(" ### Start of Semantic Unit identification process ### ")
os.chdir(topLvlDir)
#import SUI ####################################################################################


# SU to code (into folder Code)
print(" ### Convert SU back to source code ### ")
#from codeConverter import convertToCode ####################################################################################


# Copy code results to the targetBranch and then compare
os.chdir(topLvlDir+"/Code")
# Find files that end with .c or .h, then copy them from Code to Target/src, including their parent structure (--parents). Be verbose (-v)
os.system("find -iname '*.[c|h]' -exec cp --parent -v {} "+topLvlDir+"/"+resultFoldername+"/Target/src/ \;")

# # # Scenario analysis # # #
print(" ### Starting analysis... ### ")

## Sc 1: Diff SU vs target
print(" ### Check scenario 1 ### ")
os.chdir(topLvlDir+"/"+resultFoldername+"/Target/src/")
# Add new files, if any
os.system("git add .") 
# Reversed patch to simplify the addition
os.system("git diff -w -b -R --staged --find-copies > "+topLvlDir+"/"+resultFoldername+"/S1Diff.txt") 

# Regex pattern: Starts with +,-,@ or lines containing only whitespaces or lines containing only whitespaces and brackets
p = re.compile("(^[+-@])|(^(\s+)$)|(^((\s*[}{()]\s*)+)$)")
# Bool for the first scenario
scenario1 = True
# List for the file content of the patch
patch = []
# List for all files that need to be changed
targetFiles = []
# Bool for skipping the patch header
skip = False

# Check if there are similar lines in the SU and the Target
with open(topLvlDir+"/"+resultFoldername+"/S1Diff.txt", 'r', encoding="iso-8859-1") as file:
    for line in file:
        # Skip the header
        if line.startswith( "diff --git"):
            skip = True
            
        if not skip: 
            # Look for similar lines
            if not re.match(p, line):
                print("Duplicate lines found: "+line)
                scenario1 = False
         
        # Stop skipping, as header ends here    
        if line.startswith( "@@"):
            skip = False         

## Scenario 1
if (scenario1):
    print("Found no similarities! Scenario 1 is positive!")
    ### Only additions of SU -> Just add them to target, we are finished ###
    with open(topLvlDir+"/"+resultFoldername+"/S1Diff.txt", 'r', encoding="iso-8859-1") as file:
        for line in file:
            # Add all lines except removals to the patch
            if not (line.startswith("-") and not line.startswith("---")):
                patch.append(line)
                       
    # Fix brackets
    patch = fixBrackets(patch) 
    
    # Write patch content to file (do we really need this or should we work with the patch variable?)
    file = open(topLvlDir+"/"+resultFoldername+"/patch.patch", 'w')   
    file.write("".join(patch))
    file.close()  
    
    # Get all affected files from the patch
    targetFiles = getTargetFiles(topLvlDir+"/"+resultFoldername+"/patch.patch", targetFiles)

    # Assembly target files and write them 
    for file in targetFiles:
        assemblyTargetFile(file)

    print(" ### Code transplantation finished sucessfull! ### ")
else:   
## Sc 2: Diff SU vs origin        
    print("Found some similarities! Scenario 1 is negative!")
    print(" ### Check scenario 2 ### ")
    
 



# Addition of variability?


# Currently not needed stuff #
 
# Reset working directory
#print("Reset Target directory")
#os.chdir(topLvlDir+"/"+resultFoldername+"/Target/")
#os.system("git reset --hard")
#os.system("git clean -fd")
# Apply patch
#os.system("git apply --stat "+topLvlDir+"/"+resultFoldername+"/patch.patch")
#os.system("git apply --stat "+topLvlDir+"/"+resultFoldername+"/S1Diff.txt")
#os.system("git apply "+topLvlDir+"/"+resultFoldername+"/S1Diff.txt")   

# Regex pattern: Starts with +,-,@ or "diff --git" or "index" followed by a number or lines containing only whitespaces or lines containing only whitespaces and brackets
#p = re.compile("(^[+-@])|(^diff --git)|(^index \d)|(^deleted file mode \d)|(^(\s+)$)|(^((\s*[}{()]\s*)+)$)")

# Create a new branch from SU
#os.chdir(topLvlDir+"/Code") --------------------------------------------------------------------------------------------
#os.system("git init") --------------------------------------------------------------------------------------------
#os.system("git checkout -b SU") --------------------------------------------------------------------------------------------
#os.system("git add .") --------------------------------------------------------------------------------------------
#os.system("git commit -m \"New Branch for SU\" ") --------------------------------------------------------------------------------------------