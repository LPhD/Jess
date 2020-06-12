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
import datetime


#Timer
start_time = time.time()


#### Configuration ####
# Enable debug output
DEBUG = False
# Enable evaluation mode for validating workflow. Includes installation and running tests of the selected project. Therefore: Much slower.
EVALUATION = True
# Name of the configuration option to de/endable the SU
SUName = "SU"


#### Global variables ####
# Get current path
topLvlDir = os.getcwd()
# Add folder to work with
resultFoldername = "Results"
# Add folder for diffs
diffFoldername = "DiffResults/"
# Dictionary for the final merge result, key is the filepath (e.g. /src/C.c)
mergeResult = {}
# List for all files that exist in the SU but not in Target
newFiles = []
# Semantic blocks begin and end with ### (the *? activates non-greedy behavior, as the block should end with the first ###)
functionBlockPattern = re.compile("###.*?###")
# Semantic blocks begin and end with ### (the *? activates non-greedy behavior, as the block should end with the first #*#)
ifdefBlockPattern = re.compile("#\*#.*?#\*#")
# Combines all semantic block patterns (for removing them all)
semanticBlockPattern = re.compile("(###.*?###)|(#\*#.*?#\*#)")



#### Main function ####

def workflow():
    global mergeResult
    
    #### Begin of the workflow #### 
    print(" ### Welcome to the interactive code migration workflow ### ")
    print(" ### Prerequisite 1: Version control with Git ### ")
    print(" ### Prerequisite 2: Jess server is (re-)started before running the script ### ")
    print(" ### Prerequisite 3: The top level folder for source files is called 'src' ### ")
    print(" ### Results are stored in the *"+resultFoldername+"* folder ### ")
    
    # Collect useful statistics
    if EVALUATION:
        print("* * * Evaluation mode is on * * *")
        if not os.path.exists("EvaluationStatistics"):
            os.makedirs("EvaluationStatistics")
        with open("EvaluationStatistics/timings.txt", "a") as file:
            file.write("\n----------------------------------------------------------------")
            file.write("\nBegin new run at: "+str(datetime.datetime.now()))
        with open("EvaluationStatistics/sizes.txt", "a") as file:
            file.write("\n----------------------------------------------------------------")
            file.write("\nBegin new run at: "+str(datetime.datetime.now()))
        with open("EvaluationStatistics/testResults.txt", "a") as file:
            file.write("\n----------------------------------------------------------------")
            file.write("\nBegin new run at: "+str(datetime.datetime.now()))            
            
            
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
        importProjectasCPG("DonorProject", "/DonorProjectCode/src") 
  
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
    
    # SU to code (into folder Code) using the SEMANTIC option (enhances code with additional semantic information)
    print(" ### Convert SU back to source code ### ")    
    convertToCode(True, topLvlDir+"/"+resultFoldername, "SUCode/src")     

    ## Initalize analyses 
    print("Initializing...")  
    # Set list of changed targetFiles 
    initializeAnalysis()     
      
    ## Diff SU vs Target 
    print(" ### Diff SU vs Target  ### ")
    #Diff SU and Target (both with semantically enhanced code). Saves the different changes into their respective dictionary.
    getDiffs()            

    # Creates all files from the SU in Target, that did not exist there before. 
    print("Create completely new files in Target...")
    createCompletelyNewFiles(newFiles)    

    # Create the final files 
    print("Create merged files in Target...")
    for fileName in mergeResult.keys():
        assembleFiles(fileName) 
        
    #Finish workflow
    print(" ### Code transplantation finished sucessfull! ### ")
    print(" ### Please compile the code to check for duplicate identifiers ### ")               
    print ("The whole workflow took", time.time() - start_time, "seconds to run")  
        
#TODO Scan for occurences of re-defined strings? Locally and in the whole project? This has to be done after SU and Target were merged! 
#TODO Syntax check?
     

#### Helper functions ####

# Creates all needed repositories
def createRepos():
    # Measure timings
    if EVALUATION:
        start_checkout = time.time()
        with open("EvaluationStatistics/timings.txt", "a") as file:
            file.write("\n"+str(datetime.datetime.now())+": Starting with checkout...") 
    
    
    #repoURL = input("Please type in the url to your Git repository \n") 
    repoURL = "https://github.com/ggreer/the_silver_searcher.git"
    print("Set donor repo to: "+repoURL+".")

    # Get donor
    #donorBranch = input("Please type in the name of the branch that contains the functionality you would like to merge (donor branch) \n")   
    donorBranch = "master"  
    print("Set donor branch to: "+donorBranch+".")
    
    #donorCommit = input("Please type in the commit id of the version of the software that contains the desired functionality \n")   
    donorCommit = "33d9d711766cbf3c5d9b52aa471722522b231d94"  
    print("Set commit id to: "+donorCommit+".")
    
    os.system("git clone -b "+donorBranch+" "+repoURL+" "+resultFoldername+"/DonorProjectCode") 
    os.chdir(resultFoldername+"/DonorProjectCode")    
    os.system("git checkout "+donorCommit)  
    #Get back to top level folder
    os.chdir(topLvlDir)
    
    # Get target    
    #targetBranch = input("Please type in the name of the branch you would like to merge into (target branch) \n")   
    targetBranch = "master"    
    print("Set target branch to: "+targetBranch+".")
    
    #targetCommit = input("Please type in the commit id of the version of the software that you would like to merge into \n")   
    targetCommit = "abd982483eabb91b7ccf9eed2a918f638c149a7d" 
    print("Set commit id to: "+targetCommit+".")
    
    os.system("git clone -b "+targetBranch+" "+repoURL+" "+resultFoldername+"/TargetProjectCode") 
    os.chdir(resultFoldername+"/TargetProjectCode")    
    os.system("git checkout "+targetCommit)  
    os.chdir(topLvlDir)
 
 
    # Measure timings and perform additional actions required for evaluation (installation, run tests, etc.)
    if EVALUATION:
        setupProjectsForEvaluation(repoURL, donorCommit, targetCommit, start_checkout)


# Measures timings, installs projects, runs their tests and measures results 
def setupProjectsForEvaluation(repoURL, donorCommit, targetCommit, start_checkout):
    #Count lines and words in all *.c and *.h files in Target
    os.chdir(topLvlDir+"/"+resultFoldername+"/TargetProjectCode")
    tLines = os.popen("( find ./ -name '*.c' -or -name '*.h' -print0 | xargs -0 cat ) | wc -l").read()
    tWords = os.popen("( find ./ -name '*.c' -or -name '*.h' -print0 | xargs -0 cat ) | wc -w").read()

    #Count lines and words in all *.c and *.h files in Donor
    os.chdir(topLvlDir+"/"+resultFoldername+"/DonorProjectCode")
    dLines = os.popen("( find ./ -name '*.c' -or -name '*.h' -print0 | xargs -0 cat ) | wc -l").read()
    dWords = os.popen("( find ./ -name '*.c' -or -name '*.h' -print0 | xargs -0 cat ) | wc -w").read()
    os.chdir(topLvlDir)
    
    # Write counted results to file
    with open("EvaluationStatistics/sizes.txt", "a") as file:
        file.write("\n"+str(datetime.datetime.now())+": Target size is lines: "+tLines+" and words: "+tWords) 
        file.write(str(datetime.datetime.now())+": Donor size is lines: "+dLines+" and words: "+dWords) 

    # Measure timings of installation and test processes separately
    installAndTest_start = time.time()
    
    # Install dependencies for all projects
    os.system("sudo apt-get install -y automake pkg-config libpcre3-dev zlib1g-dev liblzma-dev")
    
################################# silver_searcher #########################################################################
    installSilverSearcher()    
################################# silver_searcher end #########################################################################
    
    # Get timings    
    installAndTest_duration = time.time() - installAndTest_start
    checkout_duration = time.time() - start_checkout
    print("Setting up projects and running tests took "+str(installAndTest_duration)+" seconds to run")
    print("The whole checkout process took "+ str(checkout_duration) +" seconds")
    with open("EvaluationStatistics/timings.txt", "a") as file:
        file.write("\n"+str(datetime.datetime.now())+": Project url is: "+repoURL+" and commit ids are: "+str(donorCommit)+" (Donor) and "+str(targetCommit)+" (Target)") 
        file.write("\n"+str(datetime.datetime.now())+": Setting up projects and running tests took "+str(installAndTest_duration)+" seconds to run") 
        file.write("\n"+str(datetime.datetime.now())+": The whole checkout process took "+ str(checkout_duration) +" seconds") 



# Installation and test process for the_silver_searcher
def installSilverSearcher():
#ToDo install cram?
    # Install Target
    os.chdir(topLvlDir+"/"+resultFoldername+"/TargetProjectCode")
    os.system("./build.sh")
    os.system("sudo make install")
    # Run Target's tests
    os.chdir("tests/")
    print("Running Target's tests. This make take a while...")
    tTests = os.popen("cram -v ./").read()
    # Store test results
    os.chdir(topLvlDir)
    with open("EvaluationStatistics/testResults.txt", "a") as file:    
        file.write("\n"+str(datetime.datetime.now())+": Results for Target: "+tTests) 
    
    
    # Install Donor
    os.chdir(topLvlDir+"/"+resultFoldername+"/DonorProjectCode")
    os.system("./build.sh")
    os.system("sudo make install")
    # Run Donor's tests
    os.chdir("tests/")
    print("Running Donors's tests. This make take a while...")
    dTests = os.popen("cram -v ./").read()
    # Store test results
    os.chdir(topLvlDir)
    with open("EvaluationStatistics/testResults.txt", "a") as file:    
        file.write("\n"+str(datetime.datetime.now())+": Results for Donor: "+dTests)  
 

 
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
    global mergeResult, newFiles 
    affectedTargetCodeFolder = "TargetProjectSliceCode/src"
    
    # Delete old results
    os.chdir(topLvlDir+"/"+resultFoldername)
    if os.path.exists(affectedTargetCodeFolder): 
        shutil.rmtree(affectedTargetCodeFolder)
    os.makedirs(affectedTargetCodeFolder)
 
    #Get filenames from Target    
    os.chdir(topLvlDir+"/"+resultFoldername+"/TargetProjectCode/src")
    targetFiles = glob.glob('**/*.[c|h]', recursive=True)
    #Get filenames from SUCode 
    os.chdir(topLvlDir+"/"+resultFoldername+"/SUCode/src")
    SUFiles = glob.glob('**/*.[c|h]', recursive=True)    

    for fileName in SUFiles:
        #Collect all files that can be affected by a merge
        if fileName in targetFiles: 
            mergeResult[fileName] = [] 
        #Collect files exclusive to the SU    
        else:
            newFiles.append(fileName)
            
    if DEBUG: print("Affected files: "+str(mergeResult.keys()))  
    if DEBUG: print("Files exclusive to the SU: "+str(newFiles))  
 
    #Copy only affected files from TargetCode to affectedTargetCodeFolder 
    os.chdir(topLvlDir+"/"+resultFoldername+"/TargetProjectCode/src")
    print("Copy differing files from Target")
    for filename in list(mergeResult.keys()):
        os.system("cp --parent -v -r "+filename+" "+topLvlDir+"/"+resultFoldername+"/"+affectedTargetCodeFolder)
    
    os.chdir(topLvlDir+"/"+resultFoldername)
    #Import Target as CPG 
    importProjectasCPG("TargetProjectSlice", "/"+affectedTargetCodeFolder) 
    
    #Remove old code results (replace the affected Target files with their semantic enhanced version)
    shutil.rmtree(affectedTargetCodeFolder) 
    
    #Export target to code with semantic enhancement
    convertToCode(True, topLvlDir+"/"+resultFoldername, affectedTargetCodeFolder) 



#Create relatable diffs for SU and Target using own implementation
def getDiffs():      
    global scenario1
    # Collect all non-function-like defines here, to scan the whole project afterwards (after SU and Target are merged, then we need to change this variable to global)
    listOfDefines = []
    
    os.chdir(topLvlDir+"/"+resultFoldername)
    # Make folders for diff results
    if os.path.exists(diffFoldername):
        shutil.rmtree(diffFoldername)
    os.makedirs(diffFoldername)
    
    #Find similar lines for each file-pair of SU and Target
    for filename in mergeResult.keys():
        diffFileName = filename.replace("/",".")+"Diff.txt"
        
        if DEBUG: print("Current diff file: "+diffFileName)
        if DEBUG: print("Current filename: "+filename)
       
        #Open Target and SU file pair (do this nested, as otherwise the readeability of one line is bad)
        with codecs.open("SUCode/src/"+filename, 'r', encoding='utf-8', errors='ignore') as SUFile:
            with codecs.open("TargetProjectSliceCode/src/"+filename, 'r', encoding='utf-8', errors='ignore') as targetFile:
                with codecs.open(diffFoldername+diffFileName, 'w', encoding='utf-8', errors='ignore') as diffFile:
                    #Get the content of SU
                    SUFileContent = SUFile.readlines()                    
                    #Set initial merge result based on target
                    mergeResult[filename] = targetFile.readlines()
                    #Copy the merge result, as we need one list for searching (where matches get erased) and one for building the merge content
                    mergeResultCopy_forSearching = mergeResult[filename].copy()
                    
                    #This index is for preserving the relative order of the statements. Currently, we add lines based on the position of their predecessor
                    anchorIndex = 0       
                    
                    #We want to keep the SU exclusive blocks together, so we check if the previous line was exclusive
                    lastLineIsExclusive = False                    
                    
                    #Compare each line of SU with each line of Target (and remove matched lines from targetFileContent afterwards, to reduce matching effort)
                    for line in SUFileContent:
                        found = False
                        
                        #For each line of Target
                        for index, targetLine in enumerate(mergeResultCopy_forSearching):
                            # line is in Target and SU (ignore empty lines)
                            if (not line == "\n") and line == targetLine:
                                if DEBUG: print("Found same line: "+line+" at index: "+str(index))
                                
                                #We write this here only for logging purposes
                                if DEBUG: diffFile.write(" "+line)   
                                
                                #Clear the matched line, as we need a one to one matching
                                mergeResultCopy_forSearching[index] = ""
                                
                                #If the previous line was the last line of a SU exclusive block 
                                if lastLineIsExclusive:
                                    #Add the #endif after the index of the last SU exclusive line (which ends the block)
                                    mergeResult[filename].insert(anchorIndex+1, "#endif\n")
                                    #Also add an empty line to the copy, to keep the indices consistent
                                    mergeResultCopy_forSearching.insert(anchorIndex+1, "")
                                
                                #If we added an additional line before the current index, we need to increment the anchor
                                if anchorIndex <= index and lastLineIsExclusive:
                                    anchorIndex = index +1
                                else:
                                    #Set the current anchorIndex, so that we insert the SU lines at the right position if possible
                                    anchorIndex = index
                                                                
                                #Set new bools
                                found = True
                                lastLineIsExclusive = False
                                                            
                                #Stops the iteration, as we change the length of the list and do not need to iterate further
                                break
                                
                        # line is in SU but not in Target        
                        if (not line == "\n") and not found:
                            if DEBUG: print("+ + + Found additional line: "+line+" at index: "+str(index))
                            
                            #Look for for non-function-like macros (identifier does not contain an opening bracket)
                            if re.match("^\s*\#define [^(]+ ", line):
                                print(" * * * Caution: SU contains a #define that may affect the Target -> "+line+" in file: "+filename)
                                listOfDefines.append(line)
#TODO Scan for occurences of identifier? Locally and in the whole project? This has to be done after SU and Target were merged! 
                                       
                            #We write this here only for logging purposes
                            if DEBUG: diffFile.write("+"+line)
                            
                            #We set the new index of the current line as new anchor
                            anchorIndex = anchorIndex + 1
                                                       
                            #If this is the first line of a SU exclusive block, insert an #ifdef
                            if not lastLineIsExclusive:
                                mergeResult[filename].insert(anchorIndex, "#ifdef "+SUName+"\n")
                                #Also add an empty line to the copy, to keep the indices consistent
                                mergeResultCopy_forSearching.insert(anchorIndex, "")
                                #We set the new index of the current line as new anchor
                                anchorIndex = anchorIndex + 1
                           
                            # Add the SU exclusive line at the new index
                            mergeResult[filename].insert(anchorIndex, line)
                            #Also add an empty line to the copy, to keep the indices consistent
                            mergeResultCopy_forSearching.insert(anchorIndex, "")
                            
                            lastLineIsExclusive = True
                            
                            if DEBUG: print("Insert new line: "+line+"+ at index: "+str(anchorIndex))
                            
# TODO Check if line belongs to a block, keep blocks whole
# ToDo: Add more complex analysis for #ifdefs and #defines? Currently we are just looking at one previous line
                        
                              
                     

# Write completely new files directly to Target. We need to syntax check later, as they could accidentally double declare identifiers.
# Otherwise (aside from defines) they cannot affect Target (as there are no uses from Target files to them)
def createCompletelyNewFiles(fileList):  
    if DEBUG: print("List of completely new files: "+str(fileList))
    
    # Go to SU directory (not Donor, as the completely new files are still slices)
    os.chdir(topLvlDir+"/"+resultFoldername+"/SUCode/src")
    # Iterate through all completely new files
    for fileName in fileList:
        #Copy file from SU to Target
        os.system("cp --parent -v -r "+fileName+" "+topLvlDir+"/"+resultFoldername+"/TargetProjectCode/src")
        
        #Soround the SU code with an ifdef block
#TODO We could/should add an include statement for a configuarion file here?        
        fileContent = ["#ifdef "+SUName+"\n"]
        
        #Read current file content (with semantic enhancement)
        with open(topLvlDir+"/"+resultFoldername+"/TargetProjectCode/src/"+fileName, 'r') as file:
            fileContent += file.readlines()
        
        #End the ifdef block of the SU
        fileContent += ["#endif\n"]
        
        #Remove semantic enhancement   
        with open(topLvlDir+"/"+resultFoldername+"/TargetProjectCode/src/"+fileName, 'w') as file:    
            for line in fileContent:
                line = re.sub(semanticBlockPattern, '', line)
                file.write(line)
                           
    os.chdir(topLvlDir+"/"+resultFoldername)

 

# Add the patch content to the respective file (append the content from SU to the TargetFiles?)   
def assembleFiles(filePath):    
    global mergeResult
    
    # Write assembled content to file
    with open(topLvlDir+"/"+resultFoldername+"/TargetProjectCode/src/"+filePath, 'w') as file:
        for line in mergeResult[filePath]:
            line = re.sub(semanticBlockPattern, '', line)
            file.write(line)
        

        
#### Helper functions end ####

# Start the workflow
workflow()
