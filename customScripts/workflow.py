#!/usr/bin/env python3
from octopus.server.DBInterface import DBInterface
from codeConverter import convertToCode
from evaluation import evaluateProject
import subprocess
import os
import shutil
import re

#### Global variables ####
DEBUG = False
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
# List for all files that need to be changed
targetFiles = []
# Dictionary for all additions (content of the donor file)
additionList = {}
# Dictionary for all removals (content of the target file)
removalList = {}
# Dictionary for all similar lines between donor and target file
similarList = {}
# List for the file content of the patch
patch = []
# Regex pattern: Starts with +,-,@ or lines containing only whitespaces 
changePattern = re.compile("(^[+-@])|(^(\s+)$)")
# Ignore lines containing only brackets or #endifs
#ignorePattern = re.compile("(^((\s*[}{()]\s*)+)$)|(^((\s*\#endif\s*)+)$)")
# TODO: Think about this
ignorePattern = re.compile("(^((\s*[}{()]\s*)+)$)")
# Bool for scenario 1 (only additions)
scenario1 = True

#### Helper functions ###

def sortDiffContent():
    # Bool for skipping the patch header
    skip = False
    global removalList,additionList,similarList,scenario1
    # Check if there are similar lines in the SU and the Target
    with open(topLvlDir+"/"+resultFoldername+"/S1Diff.txt", 'r', encoding="iso-8859-1") as file:
        for line in file:
            # Skip the header
            if line.startswith("diff --git"):
                skip = True
            # Set current filename 
            elif line.startswith("+++ b/"):    
                fileName = line.replace("+++ b/","",1).replace("\n","",1)
            
            if not skip: 
                # Look for similar lines and ignore elements from the ignore pattern
                if not (re.match(changePattern, line) or re.match(ignorePattern, line)):
                    if DEBUG: print("Duplicate lines found: "+line)
                    similarList[fileName].append(line)
                    scenario1 = False
                # Look for additions    
                elif (line.startswith("+") and not line.startswith("+++")):
                    if DEBUG: print("Additional lines found: "+line)
                    additionList[fileName].append(line.replace("+","",1))
                # Look for removals 
                elif (line.startswith("-") and not line.startswith("---")):   
                    if DEBUG: print("Removed lines found: "+line)
                    removalList[fileName].append(line.replace("-","",1))           
             
            # Stop skipping, as header ends here    
            if line.startswith( "@@"):
                skip = False   

def blockScan():
    # We need an analysis of blocks here, as they were currently always identified as new lines (bc of the #Block# prefix
    # We should use this to distinguish between renames and changes inside the blocks
    # Different scenarios? Or more fine-grained ones?  
    print("Scan blocks")
    
    
# Sometimes Git messes ob the matching of brackets or #endifs (identifies similar lines), we need to reverse that
def fixBrackets(patch, ignorePattern):
    for index,line in enumerate(patch):
        # Check for lines that contain ignored similarities
        if re.match(ignorePattern, line):
            patch[index] = "-" + line
                        
    return patch

# Add the patch content to the respective file   
def mergeRemovalsAndCurrentFile(filePath):    
    global additionList, removalList
    fileContent = []
    lasNewline = False
    found = False
    start = True
    
    fileContent.append("/* * * This is the beginning of the automatically transplanted code * * */") 
    fileContent.append("\n")  
    
    # Write SU content to variable, without double newlines
    for line in additionList[filePath]:
        if line.startswith("\n"):    
            lasNewline = True               
        else:               
            # Just add single newlines to the file
            if lasNewline:
               fileContent.append("\n")
               lasNewline = False
               
            # Add the file content, remove the semantic diff words   
            fileContent.append(line.replace("#Block#","").replace("#FunctionDef#","",1).replace("#BlockEnder#",""))
                
    # Always end with newlines and a comment           
    fileContent.append("\n")  
    fileContent.append("/* * * This is the end of the automatically transplanted code * * */")     
    fileContent.append("\n") 
    
    # Add target content 
    fileContent += removalList[filePath]   
   
    # Write assembled content to file
    file = open(topLvlDir+"/"+resultFoldername+"/Target/"+filePath, 'w')   
    file.write("".join(fileContent))
    file.close()

 
# Returns the file names of all files that are affected by changes
def getTargetFiles(patch, files):
    # Search for filenames
    with open(patch, 'r') as file:
        for line in file:
            files.append(line.replace("\n",""))

    return files
    
#### Helper functions end ####

#### Begin of the workflow #### 
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

# # # Scenario analysis # # #
print(" ### Starting analysis... ### ")

## Initalize analyses 
print("Initializing...")
# Copy code results to the targetBranch and then compare
os.chdir(topLvlDir+"/Code") ###################################################################################
# Find files that end with .c or .h, then copy them from Code to Target/src, including their parent structure (--parents). Be verbose (-v)
os.system("find -iname '*.[c|h]' -exec cp --parent -v {} "+topLvlDir+"/"+resultFoldername+"/Target/src/ \;") ###################################################################################
# Add new files, if any
os.chdir(topLvlDir+"/"+resultFoldername+"/Target/src/")
os.system("git add .") 

# Get names of changed files
os.system("git diff --name-only --staged  > "+topLvlDir+"/"+resultFoldername+"/NameDiff.txt")
# Get all affected files from the patch
targetFiles = getTargetFiles(topLvlDir+"/"+resultFoldername+"/NameDiff.txt", targetFiles)

# Terminate the analysis if there are no changes
if (len(targetFiles) == 0):
    print("# # # No changes found. Terminating analysis... # # #")
    exit()
else:
    # Initialize keys in the dictionaries
    for fileName in targetFiles:
        additionList[fileName] = []    
        removalList[fileName] = []   
        similarList[fileName] = []   


## Sc 1: Diff SU vs target
print(" ### Check scenario 1 ### ")
# Ignore whitespace, tab or blank line changes. 
os.system("git diff -w -b --ignore-blank-lines --staged  > "+topLvlDir+"/"+resultFoldername+"/S1Diff.txt")

# Saves the different changes into their respective dictionary
sortDiffContent()     

# Looks for similarities in blocks or their identifiers
blockScan() 

## Scenario 1 is positive, if there are no similarities between donor and target
if (scenario1):
    print("Found no similarities! Scenario 1 is positive!")
    ### Only additions of SU -> Just add them to target, we are finished ###
    for fileName in targetFiles:
        mergeRemovalsAndCurrentFile(fileName)
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