#!/usr/bin/env python3
from octopus.server.DBInterface import DBInterface
from codeConverter import convertToCode
from evaluation import evaluateProject
import subprocess
import os
import shutil
import re
import codecs
import pathlib
import glob
import time
#Timer
start_time = time.time()

#### Configuration ####
# Enable fully automated addition of the Semantic Unit to the target software
autoAdd = False
# Enable debug output
DEBUG = True
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
# Add folder for diffs
diffFoldername = "DiffResults/"
# Dictionary for all additions (content of the donor file)
additionList = {}
# Dictionary for all removals (content of the target file). We also add similar lines that can savely remain in the target (like whole method blocks)
removalList = {}
# Dictionary for all similar lines between donor and target file
similarList = {}
# Collect lines of a block contained (at least partially) in Target and SU 
currentSimilarBlock = []
# List for all files that exist in the SU but not in Target
newFiles = []
# Dict for all function names that already exist in Target and are not changed by SU
unchangedFunctionNames = {}
# List for the file content of the patch
patch = []
# Regex pattern: Starts with +,-,@ or lines containing only whitespaces 
changePattern = re.compile("(^[+-@])|(^(\s+)$)")
# Ignore lines containing only closing brackets or #endifs
ignorePattern = re.compile("(^((\s*[})]\s*)+)$)|(^((\s*\#endif\s*)+)$)")
# Semantic blocks begin and end with ### (the *? activates non-greedy behavior, as the block should end with the first ###)
functionBlockPattern = re.compile("###.*?###")
# Semantic blocks begin and end with ### (the *? activates non-greedy behavior, as the block should end with the first #*#)
ifdefBlockPattern = re.compile("#\*#.*?#\*#")
# Combines all semantic block patterns (for removing them all)
semanticBlockPattern = re.compile("(###.*?###)|(#\*#.*?#\*#)")
# Are there changes inside blocks?
inBlockChange = False
# Bool for scenario 1 (only additions)
scenario1 = True

#### Main function ####

def workflow():
    global additionList, removalList, similarList
    
    #### Begin of the workflow #### 
    print(" ### Welcome to the interactive code migration workflow ### ")
    print(" ### Prerequisite 1: Version control with Git ### ")
    print(" ### Prerequisite 2: Jess server is (re-)started before running the script ### ")
    print(" ### Prerequisite 3: The top level folder for source files is called 'src' ### ")
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
        os.chdir(topLvlDir+"/"+resultFoldername)
        #importProjectasCPG("DonorProject", "/DonorProjectCode/src") 
####################################################################################################  
    else:
        #Reset Target Repo (remove unversioned files)
        print("Reset Target directory")
        os.chdir(topLvlDir+"/"+resultFoldername+"/TargetProjectCode")
        os.system("git reset --hard")
        os.system("git clean -fd")

    # Identify SU
    print(" ### Start of Semantic Unit identification process ### ")
    print(" ### Please select 'DonorProject' as input project ### ")
    os.chdir(topLvlDir)
    import SUI 
####################################################################################    

    print(" ### Convert SU back to source code ### ")
    # SU to code (into folder Code) using the SEMANTIC option (enhances code with additional semantic information)
    convertToCode(True, topLvlDir+"/"+resultFoldername, "SUCode/src") 
####################################################################################    

    # # # Scenario analysis # # #
    print(" ### Starting analysis... ### ")

    ## Initalize analyses 
    print("Initializing...")  
    # Set list of changed targetFiles 
    initializeAnalysis()     
      
    ## Sc 1: Diff SU vs target 
    print(" ### Check scenario 1 ### ")
    #Diff SU and Target (both with semantically enhanced code). Saves the different changes into their respective dictionary.
    getDiffs()
    
    # Check header files for declarations of functions contained in Target and SU
    print("Unchanged functions: "+str(unchangedFunctionNames))
    checkHeadersForUnchangedFunctionDecls()
    
    #ToDo
    # Check similarities for entries that can savely remain in the SU (like inclusion of system headers)
    
    #ToDo
    #Copy functions that contain changes, change their name, scan whole SU for calls of that function and also change that name
    
    #ToDo
    #Do the same for global variables that are similar (change name everywhere in SU)

    # Creates all files from the SU in Target, that did not exist there before. 
    #The additionlists contains afterwards only the changed files of Target, as the completely new files were removed during the process.
    print("Create completely new files in Target...")
    createCompletelyNewFiles(newFiles)    
    
# TODO
    
    # Looks for similarities in blocks or their identifiers
    #blockScan() 
    

    ## Scenario 1 is positive, if there are no similarities between donor and target 
    ## TODO needs rework with the new semantic diff
    if (scenario1):
        print("Found no similarities! Scenario 1 is positive!")
        ### Only additions of SU -> Just add them to target, we are finished ###
        #for fileName in targetFiles:
           # mergeRemovalsAndCurrentFile(fileName)
        print(" ### Code transplantation finished sucessfull! ### ")
        print(" ### Please compile the code to check for duplicate identifiers ### ")
    else:   
    ## Sc 2: Diff SU vs origin        
        print("Found some similarities! Scenario 1 is negative!")
        print(similarList)
        print(" ### Check scenario 2 ### ")

    # Create the final files (this is here for testing purposes, currently it just adds everything from the additionList to Target)
    for fileName in additionList.keys():
        assembleFiles(fileName) 
       
    print ("The whole workflow took", time.time() - start_time, "seconds to run")  
        
#TODO Scan for occurences of re-defined strings? Locally and in the whole project? This has to be done after SU and Target were merged! 
#TODO Syntax check?
     

#### Helper functions ####

# Creates all needed repositories
def createRepos():
    #repoURL = input("Please type in the url to your Git repository \n") 
#############################
    print("Set donor repo to: "+repoURL+".")

    # Get donor
    #donorBranch = input("Please type in the name of the branch that contains the functionality you would like to merge (donor branch) \n")   
#################################################
    print("Set donor branch to: "+donorBranch+".")
    os.system("git clone -b "+donorBranch+" "+repoURL+" "+resultFoldername+"/DonorProjectCode")  


    # Get target
    #targetBranch = input("Please type in the name of the branch you would like to merge into (target branch) \n")    
#################################################
    print("Set target branch to: "+targetBranch+".")
    os.system("git clone -b "+targetBranch+" "+repoURL+" "+resultFoldername+"/TargetProjectCode") 


    # Get origin (common ancestor)
    #originCommitID = input("Please type in the commit ID of the commit that marks the last version before donor and target diverged (origin) \n") 
#################################################   
    print("Set common ancestor (origin) to: "+originCommitID+".")
    os.system("git clone "+repoURL+" "+resultFoldername+"/OriginProjectCode")  
    # Change current working directory to origin
    os.chdir(topLvlDir+"/"+resultFoldername+"/OriginProjectCode")
    os.system("git checkout "+originCommitID)
 
 
# Imports the "projectname" as Code Property Graph 
def importProjectasCPG(projectname, internalPath):
    #Check if the project contains code files, do not import it as CPG if so
    if not os.listdir(projectname+"Code/src"):
        print("There are no source files in "+projectname)
        # Copy files from SU to Target if the SU contains only new files
        if projectname == "TargetProjectSlice":
            # Creates all files from the SU in Target, that did not exist there before
            print("Create completely new files in Target...")
            createCompletelyNewFiles(newFiles)
            print(" # # # Automated transplantation finished sucessfull # # # ")
        # Exit as we are finished
        exit()

    print(" ### Start importing "+projectname+" as Code Property Graph. Please make sure the server is running ### ") 
    os.system("tar -cvzf "+projectname+" "+projectname+"Code") 
    os.system("jess-import "+projectname+"") 
    
    # Validate CPG (this includes creating the ID list that is used by the codeConverter)
    #TODO we could skip this step for performance. But then we need to tell the codeConverter the right projectname and ids
    print(" ### Validating CPG of "+projectname+" ### ") 
    # Project name, working directory, internal structure of the project
    evaluateProject(projectname, topLvlDir+"/"+resultFoldername , internalPath) 


# Setup for the analysis (copy files to the right place to get list of changed files)
def initializeAnalysis():
    global additionList, removalList, similarList, newFiles 
    affectedTargetCodeFolder = "TargetProjectSliceCode/src"
    
    # Delete old results
    os.chdir(topLvlDir+"/"+resultFoldername)
    if os.path.exists(affectedTargetCodeFolder): 
#######################################################################################################################################
        shutil.rmtree(affectedTargetCodeFolder)
    os.makedirs(affectedTargetCodeFolder)
 
    #Get filenames from Target    
    os.chdir(topLvlDir+"/"+resultFoldername+"/TargetProjectCode/src")
    targetFiles = glob.glob('**/*.[c|h]', recursive=True)
    #Get filenames from SUCode 
    os.chdir(topLvlDir+"/"+resultFoldername+"/SUCode/src")
    SUFiles = glob.glob('**/*.[c|h]', recursive=True)    

    for line in SUFiles:
        #Collect all files that can be affected by a merge
        if line in targetFiles:
            additionList[line] = []    
            removalList[line] = []   
            similarList[line] = [] 
        #Collect files exclusive to the SU    
        else:
            newFiles.append(line)
            
    if DEBUG: print("Affected files: "+str(additionList.keys()))  
    if DEBUG: print("Files exclusive to the SU: "+str(newFiles))  
 
    #Copy only affected files from TargetCode to affectedTargetCodeFolder 
    os.chdir(topLvlDir+"/"+resultFoldername+"/TargetProjectCode/src")
    print("Copy differing files from Target")
    for filename in list(additionList.keys()):
        os.system("cp --parent -v -r "+filename+" "+topLvlDir+"/"+resultFoldername+"/"+affectedTargetCodeFolder)
#######################################################################################################################################
    
    os.chdir(topLvlDir+"/"+resultFoldername)
    #Import Target as CPG 
    importProjectasCPG("TargetProjectSlice", "/"+affectedTargetCodeFolder) 
#######################################################################################################################################
    
    #Remove old code results (replace the affected Target files with their semantic enhanced version)
    shutil.rmtree(affectedTargetCodeFolder) 
#######################################################################################################################################
    
    #Export target to code with semantic enhancement
    convertToCode(True, topLvlDir+"/"+resultFoldername, affectedTargetCodeFolder) 
############################################################################################################


#Create relatable diffs for SU and Target using grep
def getDiffs():        
    os.chdir(topLvlDir+"/"+resultFoldername)
    # Make folders for diff results
    if os.path.exists(diffFoldername):
        shutil.rmtree(diffFoldername)
    os.makedirs(diffFoldername)
    
    #Find similar lines for each file-pair of SU and Target
    for filename in additionList.keys():
        diffFileName = filename.replace("/",".")+"Diff.txt"
        
        if DEBUG: print("Current diff file: "+diffFileName)
        if DEBUG: print("Current filename: "+filename)
       
        #Open Target and SU file pair (do this nested, as otherwise the readeability of one line is bad)
        with codecs.open("SUCode/src/"+filename, 'r', encoding='utf-8', errors='ignore') as SUFile:
            with codecs.open("TargetProjectSliceCode/src/"+filename, 'r', encoding='utf-8', errors='ignore') as targetFile:
                with codecs.open(diffFoldername+diffFileName, 'w', encoding='utf-8', errors='ignore') as diffFile:
                    #Get the content of the two files
                    targetFileContent = targetFile.readlines()
                    SUFileContent = SUFile.readlines()
                    
                    #Compare each line of SU with each line of Target (and remove matched lines from targetFileContent afterwards, to reduce matching effort)
                    for line in SUFileContent:
                                                
                        # line is in Target and SU (ignore empty lines)
                        if not line.startswith("\n") and line in targetFileContent:
                            #We write this here only for logging purposes
                            if DEBUG: diffFile.write(" "+line)        
                            
                            # Changes inBlockChange and currentSimilarBlock
                            analyzeSimilarities(line, filename) 
                                                                                                                                         
                            #Remove line from target to reduce effort and get the Target exclusive files
                            targetFileContent.remove(line)
                            
                        # line is in SU but not in Target
                        elif not line.startswith("\n"):
                            #We write this here only for logging purposes
                            if DEBUG: diffFile.write("+"+line)
                            
                            # Changes inBlockChange and currentSimilarBlock
                            analyzeAdditions(line, filename)
                     
# TODO do we need that? 
   #                 #Write the remaining lines of Target (Target exclusive lines)        
  #                  for line in targetFileContent:    
   #                     diffFile.write("-"+line)
    #                    analyzeRemovals(line, currentSimilarBlock, inBlockChange)      
                              

        
        

# Analyses the code exclusive to the SU
def analyzeAdditions(line, fileName):
    global additionList, scenario1, currentSimilarBlock, inBlockChange
    # Collect all non-function-like defines here, to scan the whole project afterwards (after SU and Target are merged, then we need to change this variable to global)
    listOfDefines = []
    
    print("Current block: "+str(currentSimilarBlock))
    
    #Analyse whole blocks, not individual lines
    if line.startswith("###") and len(currentSimilarBlock) > 0:
        if DEBUG: print("Warning: In-block change found: "+line)
        inBlockChange = True
        currentSimilarBlock.append(line)
        # We know that his block contains changes, so we do not need to check again
        if "###BlockEnder" in line:
            #ToDO
            #print("Warning: In-block change(s) found!")
            #print(currentSimilarBlock)
            
            # Reset collectors
            print("Block ended!")
            currentSimilarBlock = []
            inBlockChange = False
    else:              
        # Remove the the semantic enhancement 
        line = re.sub(semanticBlockPattern, '', line)
        # Add the line to its list
        additionList[fileName].append(line)
                         
        #Look for for non-function-like macros (identifier does not contain an opening bracket)
        if re.match("^\s*\#define [^(]+ ", line):
            print(" * * * Caution: SU contains a #define that may affect the Target -> "+line+" in file: "+fileName)
            #TODO Scan for occurences of identifier? Locally and in the whole project? This has to be done after SU and Target were merged! 
            listOfDefines.append(line)


# Analyses the code exclusive to the Target
def analyzeRemovals(line):
    #Analyse whole blocks, not individual lines
    if line.startswith("###") and len(currentSimilarBlock) > 0:
        if DEBUG: print("Warning: In-block change found: "+line)
        inBlockChange = True
        currentSimilarBlock.append(line)
        if "###BlockEnder" in line:
            #ToDO
            #print("Warning: In-block change(s) found!")
            #print(currentSimilarBlock)
            
            # Reset collectors
            currentSimilarBlock = []
            inBlockChange = False
    else:        
        # Add line to the list, remove the  the semantic enhancement
        removalList[fileName].append(re.sub(semanticBlockPattern, '', line))      
                        
                        
                        
# Analyses the code contained in SU and Target
def analyzeSimilarities(line, fileName):
    global similarList, additionList, unchangedFunctionNames, scenario1, currentSimilarBlock, inBlockChange
 
    #Analyse whole blocks, not individual lines
    if line.startswith("###"):
        if DEBUG: print("Duplicate in-block lines found: "+line)
        currentSimilarBlock.append(line)
        if "###BlockEnder" in line:
            print("Block ends here")
            # Are there changes inside the block or are they completely similar?
            if inBlockChange:
                #ToDO
                print("Warning: In-block change(s) found!")
                #print(currentSimilarBlock)
            else:
                # We do not need to add the block, as it is already contained in Target. It can savely stay there.
                # But we need to add the declaration in the header file (or in fact check if it is collected in the similar lines and remove it from there)
                # Add a key for the file, so that we can look in the respective header file
                headerFilename = fileName.replace(".c", ".h", 1)
                # Gets only the type and name of the function
                result = re.search('###BlockEnder (.*) ###', line)
                
                # Check if we have a key for the headerfile
                if headerFilename in unchangedFunctionNames:
                    #Append entry for existing key
                    unchangedFunctionNames[headerFilename].append(result.group(1))
                else:
                    #Make new entry if none exists for this file
                    unchangedFunctionNames[headerFilename] = [result.group(1)]
                                      
            # Reset collectors
            print("Block ended!")
            currentSimilarBlock = []
            inBlockChange = False
            
    else:
        if DEBUG: print("Duplicate lines found: "+line)
        #Some lines may be found as equal, but do not have a functional effect (brackets, #endif, etc)
        #Here we filter out missclassified block-enders (and add them to the addition list where they belong)
#ToDo: Do we need a stack to match openers and enders?
        if re.match(ignorePattern, line):
            additionList[fileName].append(line)
            print("Found missclassified duplicate line: "+line+" in file: "+fileName)
        else:
            similarList[fileName].append(line)
            scenario1 = False  


# For every function name in unchangedFunctionNames, there should be a header File with its declaration in similarList
def checkHeadersForUnchangedFunctionDecls():
    global unchangedFunctionNames, similarList

    for filename in unchangedFunctionNames.keys():
        # Check if we have the needed header file in the similarList
        if filename in similarList.keys():
            # Check for every function name
            for functionName in unchangedFunctionNames[filename]:
                found = False
                for index, value in enumerate(similarList[filename]):
                    # If there is an entry that contains this name in the similarList
                    if functionName in value:
                        if DEBUG: print("Found matching decl for "+functionName+" in: "+filename)
                        found = True
                        #Remove content of the current entry
                        similarList[filename][index] = ""
                   
                if not found:  print("Found probably missing declaration of the following function in "+filename+": "+functionName)
        else:
            print("Found probably missing declaration of the following functions in "+filename+": "+str(unchangedFunctionNames[filename]))
  

# Write completely new files directly to Target. We need to syntax check later, as they could accidentally double declare identifiers.
# Otherwise (aside from defines) they cannot affect Target (as there are no uses from Target files to them)
def createCompletelyNewFiles(fileList):
    global additionList 
    
    if DEBUG: print("List of completely new files: "+str(fileList))
    
    # Go to SU directory (not Donor, as the completely new files are still slices)
    os.chdir(topLvlDir+"/"+resultFoldername+"/SUCode/src")
    # Iterate through all completely new files
    for fileName in fileList:
        #Copy file from SU to Target
        os.system("cp --parent -v -r "+fileName+" "+topLvlDir+"/"+resultFoldername+"/TargetProjectCode/src")
        
        #Read current file content (with semantic enhancement)
        with open(topLvlDir+"/"+resultFoldername+"/TargetProjectCode/src/"+fileName, 'r') as file:
            fileContent = file.readlines()
            
        #Remove semantic enhancement   
        with open(topLvlDir+"/"+resultFoldername+"/TargetProjectCode/src/"+fileName, 'w') as file:    
            for line in fileContent:
                line = re.sub(semanticBlockPattern, '', line)
                file.write(line)
                           
    os.chdir(topLvlDir+"/"+resultFoldername)
 
# We need a deeper analysis of blocks (identifiers vs inside), as they were currently always identified as new lines (bc of the #Block# prefix)
def blockScan():
    global additionList, removalList, scenario1
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
    


# Add the patch content to the respective file (append the content from SU to the TargetFiles?)   
def assembleFiles(filePath):    
    global additionList, removalList
    fileContent = []
    lasNewline = False
    found = False
    start = True    
     

#TODO instead read in each file? currently we are missing similar lines. Then we just have to watch removals (inside blocks) and do not have to collect them?    
    # Add target content (because similar lines stay in target and can be used by the SU, which therefore has to come after)
    with codecs.open(topLvlDir+"/"+resultFoldername+"/TargetProjectCode/src/"+filePath, 'r', encoding='utf-8', errors='ignore') as targetFile:
        fileContent += targetFile.read()
    #fileContent += removalList[filePath]  
    
    fileContent.append("\n") 
    fileContent.append("/* * * This is the beginning of the automatically transplanted code * * */") 
    fileContent.append("\n")  
    
#TODO add variability implementation here    
    
    # Write SU content to variable, without double newlines
    for line in additionList[filePath]:
        if line.startswith("\n"):    
            lasNewline = True               
        else:               
            # Just add single newlines to the file
            if lasNewline:
               fileContent.append("\n")
               lasNewline = False
               
            # Add the file content   
            fileContent.append(line)
                
#TODO add variability implementation here  
                
    # Always end with newlines and a comment           
    fileContent.append("\n")  
    fileContent.append("/* * * This is the end of the automatically transplanted code * * */")     
    fileContent.append("\n") 
 
   
    # Write assembled content to file
    file = open(topLvlDir+"/"+resultFoldername+"/TargetProjectCode/src/"+filePath, 'w')   
    file.write("".join(fileContent))
    file.close()

        
#### Helper functions end ####

# Start the workflow
workflow()




# Currently not needed stuff #   

# Add new files, if any
#os.chdir(topLvlDir+"/"+resultFoldername+"/Target/src/")
#os.system("git add .") 
# Get names of changed files
#os.system("git diff --name-only --staged  > "+topLvlDir+"/"+resultFoldername+"/NameDiff.txt")
# Get all affected files from the patch
#targetFiles = getTargetFiles(topLvlDir+"/"+resultFoldername+"/NameDiff.txt", targetFiles) 

#Diff SU and Target (both with semantically enhanced code). Ignore whitespace, tab or blank line changes. Use the histogram algorithm, as it is better at finding moved functions. The "patience" algorithm is an alternative, ToDO: check which one behaves better.
#os.system("git diff -w -b --ignore-blank-lines --no-index --histogram TargetProjectSliceCode/ SUCode/ > S1Diff.txt")    
#os.system("git diff -w -b --ignore-blank-lines --no-index --patience TargetProjectSliceCode/ SUCode/ > S1Diff.txt")  
 
#os.system("git diff -w -b --ignore-blank-lines --staged  > "+topLvlDir+"/"+resultFoldername+"/S1Diff.txt")
 
# Reset working directory
#print("Reset Target directory")
#os.chdir(topLvlDir+"/"+resultFoldername+"/Target/")
#os.system("git reset --hard")
#os.system("git clean -fd")

# Apply patch
#os.system("git apply --stat "+topLvlDir+"/"+resultFoldername+"/patch.patch")
#os.system("git apply --stat "+topLvlDir+"/"+resultFoldername+"/S1Diff.txt")
#os.system("git apply "+topLvlDir+"/"+resultFoldername+"/S1Diff.txt")   

    
        # -F disables regex (see input as string only), -x matches complete lines, -f compares files. Here we get all similar lines among SU and Target
# ToDo think about implementing this? We iterate over the file currently twice (here and later)      Currently, we do not have the right order 
        #os.system("grep -Fxf TargetProjectSliceCode/src/"+filename+" SUCode/src/"+filename+" > "+diffFileNameSimilarities) 

#ToDo This seems not to work so well        
        # -v finds all different lines (seems not to work with -F). We now look for all lines that are only contained in SU (and therefore not in the similarities diff)
        #os.system("grep -vxFf DiffResults/Similarities/"+filename.replace("/","")+"Diff.txt SUCode/src/"+filename+" > "+diffFileName)       
        # Finally we now look for all lines that are only contained in Target (and therefore not in the similarities diff)
        #os.system("grep -vxFf DiffResults/Similarities/"+filename.replace("/","")+"Diff.txt TargetProjectSliceCode/src/"+filename+" > "+diffFileName) 

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


 
# Returns the file names of all files that are affected by changes
#def getTargetFiles(patch, files):
#    # Search for filenames
#    with open(patch, 'r') as file:
#        for line in file:
#            files.append(line.replace("\n",""))
#
#    return files

# Copy code results to the targetBranch and then compare
#os.chdir(topLvlDir+"/"+resultFoldername+"/Code") ###################################################################################
# Find files that end with .c or .h, then copy them from Code to Target/src, including their parent structure (--parents). Be verbose (-v)
#os.system("find -iname '*.[c|h]' -exec cp --parent -v {} "+topLvlDir+"/"+resultFoldername+"/Target/src/ \;") ###################################################################################

#    # # # Just add the Semantic Unit to the Target if autoAdd is enabled, no further analysis # # #
#    if autoAdd:
#        # Currently not working
#        autoAddFunct()
#    # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # #                                                 
#    else:
#        print("This is true")

# Currently not working. Possible function for automated evaluation? Just adds the SU to the target.    
#def autoAddFunct():    
#    print(" ### Automated addition mode is activated ### ")
#    print(" ### Convert SU back to source code ### ")
#    # SU to code (into folder AutoAddCode) 
#    convertToCode(False, topLvlDir+"/"+resultFoldername, "AutoAddCode")
#    # Import SU as CPG (+ validation and creation of ID list needed for the conversion back to code)
#    importProjectasCPG("SU")      
#    # Add prefixes
#    addPrefixes()
#    # SU to code (into folder AutoAddCode) 
#    convertToCode(False, topLvlDir+"/"+resultFoldername, "AutoAddCode")
#    ## Add code to target
#
#    print(" ### Automated addition finished sucessfull ### ")
#    # Terminate the workflow
#    exit()

# Adds prefixes to all identifiers in the SU that were declared inside
#def addPrefixes():
#    print("Adding prefixes...")
#    # Connect to SU project
#    db = DBInterface()
#    db.connectToDatabase("SU")
#    
#    query = """g.V().has('type', 'Identifier').values("code")"""    
#    
#    print(db.runGremlinQuery(query))  

    
# Sometimes Git messes ob the matching of brackets or #endifs (identifies similar lines), we need to reverse that
#def fixBrackets(patch, ignorePattern):
#    for index,line in enumerate(patch):
#        # Check for lines that contain ignored similarities
#        if re.match(ignorePattern, line):
#            patch[index] = "-" + line
#                        
#    return patch

# Addition of variability?