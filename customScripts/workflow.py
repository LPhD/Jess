#!/usr/bin/env python3
from octopus.server.DBInterface import DBInterface
from codeConverter import convertToCode
from evaluation import evaluateProject
import subprocess
import os
import shutil
import re
import codecs


#### Configuration ####
# Enable fully automated addition of the Semantic Unit to the target software
autoAdd = True
# Enable debug output
DEBUG = False
# Repo URL
repoURL = "https://github.com/LPhD/EvoDiss.git" ###################################################
# Relevant branches
donorBranch = "OnlyBubble" ########################################################################################
targetBranch = "Base_PL" ########################################################################################################
originCommitID = "cbaaa929cd2b646cfd332ea753543e08a405bc4b" #########################################################################

#### Global variables ####
# Get current path
topLvlDir = os.getcwd()
# Add folder to work with
resultFoldername = "Results"
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

#### Main function ####

def workflow():
    global additionList, removalList, similarList
    
    #### Begin of the workflow #### 
    print(" ### Welcome to the interactive code migration workflow ### ")
    print(" ### Prerequisite 1: Version control with Git ### ")
    print(" ### Prerequisite 2: Jess server is (re-)started before running the script ### ")
    print(" ### Results are stored in the *"+resultFoldername+"* folder ### ")

    #Import new branches or reuse old ones?
    reuse = input("Would you like to work with a new project (1) or keep the last one (2) ?\n")

    # Make a new CPG or reuse the previous one
    if (reuse == "1"):   
        # Delete old results
        if os.path.exists(resultFoldername):
            shutil.rmtree(resultFoldername)
        os.makedirs(resultFoldername)

        # Creates the needed repositories for Donor, Target and Origin
        createRepos()
        
        # Imports the Donor as Code Property Graph and validates the result
        importAndValidateCPG()
         

    # Identify SU
    print(" ### Start of Semantic Unit identification process ### ")
    print(" ### Please select 'DonorProject' as input project ### ")
    os.chdir(topLvlDir)
    #import SUI ####################################################################################

    
    
    # # # Just add the Semantic Unit to the Target if autoAdd is enabled, no further analysis # # #
    if autoAdd:
        print(" ### Automated addition mode is activated ### ")
        print(" ### Convert SU back to source code ### ")
        # SU to code (into folder Code) 
        convertToCode(False)
        # Import SU as CPG (+ validation and creation of ID list needed for the conversion back to code)
        importSUasCPG()      
        # Add prefixes
        addPrefixes()
        # SU to code (into folder Code) 
        convertToCode(False)
        ## Add code to target
        
        print(" ### Automated addition finished sucessfull ### ")
        # Terminate the workflow
        exit()
    # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # #                                                 
    else:
        print(" ### Convert SU back to source code ### ")
        # SU to code (into folder Code) using the SEMANTIC option (enhances code with additional semantic information)
        #convertToCode(True) ####################################################################################
    

    # # # Scenario analysis # # #
    print(" ### Starting analysis... ### ")

    ## Initalize analyses 
    print("Initializing...")  
    # Set list of changed targetFiles 
    initializeAnalysis()   

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
    ## TODO needs rework with the new semantic diff
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
        
     

#### Helper functions ####

# Creates all needed repositories
def createRepos():
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
 
 
# Imports the Donor as Code Property Graph and validates the result
def importAndValidateCPG():
    # Import donor as CPG
    print(" ### Start importing donor as Code Property Graph. Please make sure the server is running ### ")
    os.chdir(topLvlDir+"/"+resultFoldername) 
    os.system("tar -cvzf DonorProject Donor") 
    os.system("jess-import DonorProject") 

    # Validate CPG (this includes creating the ID list that is used by the codeConverter)
    print(" ### Validating CPG ### ")
    os.chdir(topLvlDir)    
    evaluateProject("DonorProject", "/Donor/") 


# Imports the SU as Code Property Graph 
def importSUasCPG():
    # Import SU as CPG
    print(" ### Start importing Semantic Unit as Code Property Graph. Please make sure the server is running ### ")
    os.chdir(topLvlDir) 
    os.system("tar -cvzf SU Code") 
    os.system("jess-import SU") 
    
    # Validate CPG (this includes creating the ID list that is used by the codeConverter)
    print(" ### Validating CPG ### ") 
    evaluateProject("SU", "/Code/") 


# Adds prefixes to all identifiers in the SU that were declared inside
def addPrefixes():
    #?
    print("Add prefixes here")


# Setup for the analysis (copy files to the right place to get list of changed files)
def initializeAnalysis():
    global targetFiles
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

        
# Saves the content of the diff in 3 separate lists (adds, removals, similar lines)        
def sortDiffContent():
    # Bool for skipping the patch header
    skip = False
    global removalList,additionList,similarList,scenario1
    # Check if there are similar lines in the SU and the Target
    with codecs.open(topLvlDir+"/"+resultFoldername+"/S1Diff.txt", 'r', encoding='utf-8', errors='ignore') as file:
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

                
# We need a deeper analysis of blocks (identifiers vs inside), as they were currently always identified as new lines (bc of the #Block# prefix)
def blockScan():
    global targetFiles, additionList, removalList, scenario1
    currentBlock = ""
    print("Scan blocks")
    for file in targetFiles:
        for line in additionList[file]:
            # Scan block content
            if line.startswith("#Block#") or line.startswith("#FunctionDef#"):
                # Beginning of the block
                if line.startswith("#FunctionDef#") or line.startswith("#Block# #FunctionDef#"):
                    # Get the identifiers of the functions (cut out the word befor the opening bracket)
                    currentBlock = line.split(" (")[0].rsplit(' ',1)[1]
                    print("Found beginning of block: "+currentBlock)
                
                    # Look for the identifier in the Target
                    for anotherLine in removalList[file]:
                        # TODO: Currently we can just check if the identifier name occurs in the target, we need a better method
                        if currentBlock in anotherLine:
                            # If the identifier of the function definition is used in the Target, set Scenario 1 to false
                            print("Found current block: "+currentBlock)
                            scenario1 = False

                
              
                
                    #print(removalList[file])
                    # Look in other files? There could be other included files with the same functio name?
                
        # Is identifier in the file?
                # No -> Do nothing. 
                # TODO for later: We could analyse if the content is the same and the name changed, then we need a namechange in all occurences of the SU
                # Yes -> Sc1 is false. Here we need further analysis.
    
    
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

# Start the workflow
workflow()




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

# Make sure file encoding is UTF-8
#os.chdir(topLvlDir+"/"+resultFoldername)
#os.system("find -iname '*.[c|h]' -exec iconv -f iso8859-2 -t utf-8 -o {}.converted {} \; -exec mv {}.converted {} \;")

# Addition of variability?