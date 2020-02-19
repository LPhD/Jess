#!/usr/bin/env python3
from octopus.server.DBInterface import DBInterface
from codeConverter import convertToCode
from evaluation import evaluateProject
import subprocess
import os
import shutil
import re

#### Global variables ####

# Get current path
topLvlDir = os.getcwd()
# Add folder to work with
resultFoldername = "Results"
# Repo URL
repoURL = "https://github.com/LPhD/EvoDiss.git" ###################################################
# Relevant branches
donorBranch = "OnlyBubble" ########################################################################################
targetBranch = "Base_PL" ########################################################################################################
originCommitID = "cbaaa929cd2b646cfd332ea753543e08a405bc4b" #########################################################################


#### Helper functions ###

# Sometimes Git messes ob the matching of brackets or #endifs (identifies similar lines), we need to reverse that
def fixBrackets(patch, ignorePattern):
    for index,line in enumerate(patch):
        # Check for lines that contain ignored similarities
        if re.match(ignorePattern, line):
            patch[index] = "-" + line
                        
    return patch

# Add the patch content to the respective file   
def assemblyTargetFile(filePath):    
    fileContent = []
    lasNewline = False
    found = False
    start = True
    
    fileContent.append("/* * * This is the beginning of the automatically transplanted code * * */") 
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
                   
                # Add the file content, remove the semantic diff words   
                fileContent.append(line.replace("#Block#","").replace("#FunctionDef#","",1).replace("#BlockEnder#",""))
                
    # Always end newlines and a comment           
    fileContent.append("\n")  
    fileContent.append("/* * * This is the end of the automatically transplanted code * * */")     
    fileContent.append("\n") 
    
    # Read patch content (do this here because we do not want to have the whole patch in the memory all the time)
    with open(topLvlDir+"/"+resultFoldername+"/patch.patch", 'r') as patch:
        for line in patch:
            # Look for the part of the patch that belongs to the file
            if line.startswith("+++ b/"+filePath):
                found = True 
                
            if start and not line.startswith("diff --git"):
                # Here is the patch content for the current file
                fileContent.append(line.replace("-","",1))
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
            if line.startswith("+++"):
                files.append(line.split("b/",1)[1].replace("\n",""))

    return files
    
#### Helper functions end ###



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
    
    #repoURL = input("Please type in the url to your Git repository \n") #############################
    print("Set donor repo to: "+repoURL+".")

    # Get donor
    #donorBranch = input("Please type in the name of the branch that contains the functionality you would like to merge (donor branch) \n")   #################################################
    print("Set donor branch to: "+donorBranch+".")
    os.system("git clone -b "+donorBranch+" "+repoURL+" "+resultFoldername+"/Donor")  


    # Get target
    #targetBranch = input("Please type in the name of the branch you would like to merge into (target branch) \n")    #################################################
    print("Set target branch to: "+targetBranch+".")
    os.system("git clone -b "+targetBranch+" "+repoURL+" "+resultFoldername+"/Target") 


    # Get origin (common ancestor)
    #originCommitID = input("Please type in the commit ID of the commit that marks the last version before donor and target diverged (origin) \n") #################################################   
    print("Set common ancestor (origin) to: "+originCommitID+".")
    os.system("git clone "+repoURL+" "+resultFoldername+"/Origin")  
    # Change current working directory to origin
    os.chdir(topLvlDir+"/"+resultFoldername+"/Origin")
    os.system("git checkout "+originCommitID) 

     
    # Import donor as CPG
    print(" ### Start importing donor as Code Property Graph. Please make sure the server is running ### ")
    #os.chdir(topLvlDir+"/"+resultFoldername) #################################################
    #os.system("tar -cvzf DonorProject Donor") ##################################################################
    #os.system("jess-import DonorProject") ###############################################################


    # Validate CPG
    print(" ### Validating CPG ### ")
    #os.chdir(topLvlDir)    #################################################
    #evaluateProject("DonorProject", "/Donor/") #################################################


# Identify SU
print(" ### Start of Semantic Unit identification process ### ")
print(" ### Please select 'DonorProject' as input project ### ")
os.chdir(topLvlDir)
#import SUI ####################################################################################


# SU to code (into folder Code) using the SEMANTIC option (enhances code with additional semantic information)
print(" ### Convert SU back to source code ### ")
#convertToCode(True) ####################################################################################


# Copy code results to the targetBranch and then compare
os.chdir(topLvlDir+"/Code") ###################################################################################
# Find files that end with .c or .h, then copy them from Code to Target/src, including their parent structure (--parents). Be verbose (-v)
os.system("find -iname '*.[c|h]' -exec cp --parent -v {} "+topLvlDir+"/"+resultFoldername+"/Target/src/ \;") ###################################################################################

# # # Scenario analysis # # #
print(" ### Starting analysis... ### ")

## Sc 1: Diff SU vs target
print(" ### Check scenario 1 ### ")
os.chdir(topLvlDir+"/"+resultFoldername+"/Target/src/")
# Add new files, if any
os.system("git add .") 
# Reversed patch to simplify the addition
#os.system("git diff -w -b -R --staged --no-indent-heuristic --find-copies > "+topLvlDir+"/"+resultFoldername+"/S1Diff.txt") ###################################################################################

#p = re.compile("(^[+-@])|(^(\s+)$)|(^((\s*[}{()]\s*)+)$)|(^((\s*\#endif\s*)+)$)")


# Ignore whitespace, tab or blank line changes and changes similar to ignorePattern. Reversed patch to simplify the addition
os.system("git diff -w -b --ignore-blank-lines --staged  > "+topLvlDir+"/"+resultFoldername+"/S1Diff.txt")


# Regex pattern: Starts with +,-,@ or lines containing only whitespaces 
changePattern = re.compile("(^[+-@])|(^(\s+)$)")
# Ignore lines containing only brackets or #endifs
ignorePattern = re.compile("(^((\s*[}{()]\s*)+)$)|(^((\s*\#endif\s*)+)$)")

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
            # Look for similar lines and ignore elements from the ignore pattern
            if not (re.match(changePattern, line) or re.match(ignorePattern, line)):
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
            # Add all lines except additions to the patch
            if not (line.startswith("+") and not line.startswith("+++")):
                patch.append(line)
                       
    # Fix brackets
    patch = fixBrackets(patch, ignorePattern) 
    
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
    print(" ### Please compile the code to check for duplicate identifiers ### ")
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