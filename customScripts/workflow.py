#!/usr/bin/env python3
from octopus.server.DBInterface import DBInterface
from codeConverter import convertToCode
from evaluation import evaluateProject
from SUI import initializeSUI
import subprocess
import os
import shutil
import re
import codecs
import pathlib
import glob
import time
import datetime
import csv


#Timer
start_time = time.time()


#### Configuration ####
# Enable debug output
DEBUG = False
# Enable evaluation mode for validating workflow. Includes installation and running tests of the selected projects. Therefore: Much slower.
EVALUATION = True
# Name of the configuration option to de/enable the SU
SUName = "SU"
# Activate to add an "#ifdef $SUName" block around the SU's code in Target
addIfdefAroundSU = False


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
blockPattern = re.compile("###.*?###")
# Semantic blocks begin and end with ### (the *? activates non-greedy behavior, as the block should end with the first #*#)
ifdefBlockPattern = re.compile("#\*#.*?#\*#")
# Combines all semantic block patterns (for removing them all)
semanticBlockPattern = re.compile("(###.*?###)|(#\*#.*?#\*#)")



#### Main function ####

def main():
    #### Begin of the workflow #### 
    print(" ### Welcome to the interactive code migration workflow ### ")
    print(" ### Prerequisite 1: Version control with Git ### ")
    print(" ### Prerequisite 2: The top level folder for source files is called 'src' ### ")
    print(" ### Results are stored in the *"+resultFoldername+"* folder ### ")
    
    # If in EVALUATION mode, iterate over all projects in projectList.csv and all commits in commitList.csv
    if EVALUATION:
        print("* * * Evaluation mode is on * * *")
        iterateThroughCommits()
              
    # Otherwise, just run the script once and interactively    
    else:  
        normalWorkflow()
              

# Normal interactive workflow without evaluation
def normalWorkflow():
    global mergeResult

    #Import new branches or reuse old ones?
    reuse = input("Would you like to work with a new project (1) or keep the last one (2) ?\n")

    #### Make a new CPG or reuse the previous one ####
    if (reuse == "1"):   
        # Delete old results
        if os.path.exists(resultFoldername):
            shutil.rmtree(resultFoldername)
        os.makedirs(resultFoldername)

        # Creates the needed repositories for Donor and Target
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

                           
    #### Identify SU ####
    print(" ### Start of Semantic Unit identification process ### ")
    print(" ### Please select 'DonorProject' as input project ### ")    
    os.chdir(topLvlDir)    
    initializeSUI(False, "entryPointType", "pathOrNameOrIdentifierOrString", "statementLine", "statementType")   
         
    #### SU to code (into folder Code) using the SEMANTIC option (enhances code with additional semantic information) ####
    print(" ### Convert SU back to source code ### ")    
    convertToCode(True, topLvlDir+"/"+resultFoldername, "SUCode/src")   
           
    #### Initalize analyses ####
    print("Initializing...")  
    # Set list of changed targetFiles 
    initializeAnalysis()     
      
    #### Diff SU vs Target ####
    print(" ### Diff SU vs Target  ### ")
    #Diff SU and Target (both with semantically enhanced code). Saves the different changes into their respective dictionary.
    getDiffs()            

    #### Creates all files from the SU in Target, that did not exist there before ####
    print("Create completely new files in Target...")
    createCompletelyNewFiles(newFiles)    

    #### Create the final files ####
    print("Create merged files in Target...")
    for fileName in mergeResult.keys():
        assembleFiles(fileName) 
        
    #### Finish workflow ####
    print(" ### Code transplantation finished sucessfull! ### ")
    print(" ### Please compile the code to check for duplicate identifiers ### ")               
    print ("The whole workflow took "+ str(time.time() - start_time) +"seconds to run")  
        
#TODO Scan for occurences of re-defined strings? Locally and in the whole project? This has to be done after SU and Target were merged! 
#TODO Syntax check?


# Same as above, but with additional statistics and evaluation processes (installation, testing, diffing)        
def iterateThroughCommits():  
    global mergeResult
    
    # Make folder for evaluation results if not existent
    if not os.path.exists("Evaluation/EvaluationStatistics"):
        os.makedirs("Evaluation/EvaluationStatistics")
    # Create usefull statistics
    with open("Evaluation/EvaluationStatistics/timings.txt", "a") as file:
        file.write("\n----------------------------------------------------------------")
        file.write("\nBegin new run at: "+str(datetime.datetime.now()))
    with open("Evaluation/EvaluationStatistics/sizes.txt", "a") as file:
        file.write("\n----------------------------------------------------------------")
        file.write("\nBegin new run at: "+str(datetime.datetime.now()))
    with open("Evaluation/EvaluationStatistics/testResults.txt", "a") as file:
        file.write("\n----------------------------------------------------------------")
        file.write("\nBegin new run at: "+str(datetime.datetime.now()))            
    with open("Evaluation/EvaluationStatistics/diffs_TargetOldvsNew.txt", "a") as file:
        file.write("\n----------------------------------------------------------------")
        file.write("\nBegin new run at: "+str(datetime.datetime.now())) 

 
    # Read input of the project list (list of projects to be evaluated)     
    with open('Evaluation/projectList.csv', mode ='r')as file: 
        # reading the CSV file 
        csvProjectFile = csv.reader(file, delimiter=";") 
        # Skip header
        next(csvProjectFile)
      
        # Iterate through projectList (one line per project)
        # Content per row: 0:Name, 1:URL, 2:Dependencies, 3:Install Location, 4:Install Commands, 5:Test Location, 6:Test Commands
        for project in csvProjectFile: 
        
            if (len(project) == 0):
                print("Project information in projectList.csv is empty!. Terminating process")
                break
                
                
            print("Evaluating project: "+project[0])               
            
            # Delete old results
            if os.path.exists(resultFoldername):
                shutil.rmtree(resultFoldername)
            os.makedirs(resultFoldername)

            # Creates the needed repositories for Donor and Target based on the URL
            createReposForEvaluation(project[1])
            
            # Install dependencies for project
            print("* * * Installing dependencies for project * * *")
            os.system("sudo apt-get install -y "+project[2])
                    
            
            # Read input of the commit list (list of commits to be evaluated)     
            with open('Evaluation/commitList.csv', mode ='r')as file: 
                # reading the CSV file 
                csvCommitFile = csv.reader(file, delimiter=";") 
                # Skip header
                next(csvCommitFile)
        
                # Iterate through commitList (one line per commit) 
                # Content per row: 0:Name, 1:Donor Commit, 2:Target Commit, 3:Entry Point Type, 4:Entry Path/Id/String, 5:Entry Line, 6:Entry Node Type, 7:Test Folder, 8:Test Name
                for commit in csvCommitFile:
                
                    if (len(commit) == 0):
                        print("Commit information in commitList.csv is empty!. Terminating process")
                        break
                    
                    # Reset collection of entry points for each new commit
                    entryPointString = ""
                    entryPointList = []
                    
                    # Only iterate through the commits of the current project
                    if (project[0] == commit[0]):
                        print("Evaluating donor commit: "+commit[1])  
                        
                        # Handle a list of entry points inside a field
                        if (commit[4].startswith("{")):
                            #Iterate over each char to build the string objects that should be inside the list
                            for char in commit[4]:
                                # Skip beginning of list declaration
                                if (not char == "{"):
                                    # Collect all chars of one string (strings are separated by a "," the listing is ended by a "}")
                                    if ((not char == ",") and (not char == "}")):
                                        entryPointString += char
                                    # Add the whole string to the list     
                                    else:
                                        entryPointList.append(entryPointString)
                                        entryPointString = ""
                                        
                        # If we don't have several entry points, just add the single point to the list directly                
                        else:
                            entryPointList.append(commit[4])
                                                  
                        # Pass the relevant information for the selected commit to the workflow                          
                        evaluationWorkflow(commit[1],commit[2],commit[3],entryPointList,commit[5],commit[6],commit[7],commit[8])
    
    # Final time measures
    print ("The whole workflow took "+ str(time.time() - start_time) +"seconds to run")  
    with open(topLvlDir+"/Evaluation/EvaluationStatistics/timings.txt", "a") as file:
        file.write("\n"+str(datetime.datetime.now())+": The whole workflow took "+ str(time.time() - start_time) +"seconds to run")
    
# TODO: How to handle restart of server?
                                               

# Same as normalWorkflow, but with additional statistics and evaluation processes (installation, testing, diffing)        
def evaluationWorkflow(donorCommit, targetCommit, entryPointType, entryPathOrNameOrIdentifierOrString, entryLine, entryNodeType, testFolder, testName):      
    global mergeResult, newFiles
    
    start_iteration = time.time()
    
    # Reset lists
    mergeResult = {}
    newFiles = []
                          
    #Reset result repos (remove unversioned files)
    print("Reset Target directory")
    os.chdir(topLvlDir+"/"+resultFoldername+"/TargetProjectCode")
    os.system("git reset --hard")
    os.system("git clean -fd")  
    os.chdir(topLvlDir+"/"+resultFoldername+"/DonorProjectCode")
    os.system("git reset --hard")
    os.system("git clean -fd")     
    os.chdir(topLvlDir)
    
    # Measure timings
    start_checkout = time.time()
    with open("Evaluation/EvaluationStatistics/timings.txt", "a") as file:
        file.write("\n"+str(datetime.datetime.now())+": * * * Starting with checkout of specific commits... * * * ") 
    
    # Checkout the specific versions to be evaluated
    checkoutCommitsForEvaluation(donorCommit, targetCommit)
    
    # Timing
    checkout_duration = time.time() - start_checkout
    print("The whole checkout process took "+ str(checkout_duration) +" seconds")
    with open("Evaluation/EvaluationStatistics/timings.txt", "a") as file:
        file.write("\n"+str(datetime.datetime.now())+": Commit ids are: "+str(donorCommit)+" (Donor) and "+str(targetCommit)+" (Target)") 
        file.write("\n"+str(datetime.datetime.now())+": The whole checkout process took "+ str(checkout_duration) +" seconds") 
        file.write("\n"+str(datetime.datetime.now())+": Starting with setup of specific commits...")          
    installAndTest_start = time.time()
    
    # Document size of Donor and Target
    measureSizes()
            
    # Perform additional actions required for evaluation (installation, run tests, etc.)
    setupProjectsForEvaluation(testFolder, testName)
    
    # Measure timings of installation and test processes separately   
    installAndTest_duration = time.time() - installAndTest_start    
    print("Setting up projects and running tests took "+str(installAndTest_duration)+" seconds to run")
    with open("Evaluation/EvaluationStatistics/timings.txt", "a") as file:
        file.write("\n"+str(datetime.datetime.now())+": Setting up projects and running tests took "+str(installAndTest_duration)+" seconds to run")  
        file.write("\n"+str(datetime.datetime.now())+": Start importing project as CPG...") 
    start_import = time.time()

    # Imports the Donor as Code Property Graph and validates the result
    os.chdir(topLvlDir+"/"+resultFoldername)
    importProjectasCPG("DonorProject", "/DonorProjectCode/src")

    # Measure timings after CPG import
    import_and_eval_duration = time.time() - start_import
    with open(topLvlDir+"/Evaluation/EvaluationStatistics/timings.txt", "a") as file:  
        file.write("\n"+str(datetime.datetime.now())+": Evaluation finished.") 
        file.write("\n"+str(datetime.datetime.now())+": Importing and evaluating projects took "+str(import_and_eval_duration)+" seconds to run") 
        file.write("\n"+str(datetime.datetime.now())+": Beginn with Semantic Unit identification...")   
    start_SUI = time.time()    
                           
    #### Identify SU ####
    print(" ### Start of Semantic Unit identification process ### ")
    # Start identification process
    os.chdir(topLvlDir)    
    # Evaluation mode on, entryPointType, pathOrNameOrIdentifierOrString, statementLine, statementType
    initializeSUI(True, entryPointType, entryPathOrNameOrIdentifierOrString, entryLine, entryNodeType)
    
    # Measure Timings after SU identification
    SUI_duration = time.time() - start_SUI
    with open(topLvlDir+"/Evaluation/EvaluationStatistics/timings.txt", "a") as file:   
        file.write("\n"+str(datetime.datetime.now())+": Identification finished.")   
        file.write("\n"+str(datetime.datetime.now())+": Semantic Unit identification process took "+str(SUI_duration)+" seconds to run")
        file.write("\n"+str(datetime.datetime.now())+": Begin with code export.")   
    start_export = time.time()         
    
    #### SU to code (into folder Code) using the SEMANTIC option (enhances code with additional semantic information) ####
    print(" ### Convert SU back to source code ### ")    
    convertToCode(True, topLvlDir+"/"+resultFoldername, "SUCode/src")   

    #Measure Timings 
    export_duration = time.time() - start_export
    with open(topLvlDir+"/Evaluation/EvaluationStatistics/timings.txt", "a") as file:    
        file.write("\n"+str(datetime.datetime.now())+": Code export finished.")   
        file.write("\n"+str(datetime.datetime.now())+": Export process took "+str(export_duration)+" seconds to run")
        file.write("\n"+str(datetime.datetime.now())+": Begin with code analysis.")
    start_analysis = time.time()        
        
    #Count lines and words in all *.c and *.h files in SU
    os.chdir(topLvlDir+"/"+resultFoldername+"/SUCode")
    suLines = os.popen("( find ./ -name '*.c' -or -name '*.h' -print0 | xargs -0 cat ) | wc -l").read()
    suWords = os.popen("( find ./ -name '*.c' -or -name '*.h' -print0 | xargs -0 cat ) | wc -w").read()
    os.chdir(topLvlDir)        
    # Write counted results to file
    with open(topLvlDir+"/Evaluation/EvaluationStatistics/sizes.txt", "a") as file:
        file.write("\n"+str(datetime.datetime.now())+": SU's size is lines: "+suLines+" and words (containing additional semantic enhancement): "+suWords) 
           
    #### Initalize analyses ####
    print("Initializing...")  
    # Set list of changed targetFiles 
    initializeAnalysis()     
      
    #### Diff SU vs Target ####
    print(" ### Diff SU vs Target  ### ")
    #Diff SU and Target (both with semantically enhanced code). Saves the different changes into their respective dictionary.
    getDiffs()            

    #Measure Timings 
    analysis_duration = time.time() - start_analysis     
    with open(topLvlDir+"/Evaluation/EvaluationStatistics/timings.txt", "a") as file:    
        file.write("\n"+str(datetime.datetime.now())+": Analysis finished. ")  
        file.write("\n"+str(datetime.datetime.now())+": Analysis process took "+str(analysis_duration)+" seconds to run")
        file.write("\n"+str(datetime.datetime.now())+": Begin with merging.")
    start_merge = time.time() 
    
    #### Creates all files from the SU in Target, that did not exist there before ####
    print("Create completely new files in Target...")
    createCompletelyNewFiles(newFiles)    

    #### Create the final files ####
    print("Create merged files in Target...")
    for fileName in mergeResult.keys():
        assembleFiles(fileName) 

    # Measure timings and size. 
    merge_duration = time.time() - start_merge
    with open(topLvlDir+"/Evaluation/EvaluationStatistics/timings.txt", "a") as file:    
        file.write("\n"+str(datetime.datetime.now())+": Merge finished.") 
        file.write("\n"+str(datetime.datetime.now())+": Merge process took "+str(merge_duration)+" seconds to run")
        file.write("\n"+str(datetime.datetime.now())+": Begin with installation and test of merged Target.")  
        
    # Count lines and words in all *.c and *.h files in merged Target
    os.chdir(topLvlDir+"/"+resultFoldername+"/TargetProjectCode")
    tLines = os.popen("( find ./ -name '*.c' -or -name '*.h' -print0 | xargs -0 cat ) | wc -l").read()
    tWords = os.popen("( find ./ -name '*.c' -or -name '*.h' -print0 | xargs -0 cat ) | wc -w").read()
    
    #Get a diff of old vs new Target
    os.system("git diff -w -b --ignore-blank-lines  > "+topLvlDir+"/Evaluation/EvaluationStatistics/diffs_"+str(donorCommit)+"_in_"+str(targetCommit)+"_"+str(entryPointType)+".txt")
    os.chdir(topLvlDir)    
    
    # Write counted results to file
    with open(topLvlDir+"/Evaluation/EvaluationStatistics/sizes.txt", "a") as file:
        file.write("\n"+str(datetime.datetime.now())+": Final merged Target's size is lines: "+tLines+" and words: "+tWords)                             
        
    # Measure timings
    start_final_installation = time.time()
    
    # Install Target, move (from Donor to Target), run, and document tests  
################################# silver_searcher #############################################################################   
    moveSilverSearcherTests(testFolder, testName)
    installSilverSearcher("Target")
################################# silver_searcher end #########################################################################

    # Measure timings 
    final_installation_duration = time.time() - start_final_installation
    with open(topLvlDir+"/Evaluation/EvaluationStatistics/timings.txt", "a") as file:    
        file.write("\n"+str(datetime.datetime.now())+": Final installation and test finished.")    
        file.write("\n"+str(datetime.datetime.now())+": Installation and test took "+str(final_installation_duration)+" seconds to run")        
        file.write("\n"+str(datetime.datetime.now())+": This iteration took "+ str(time.time() - start_iteration) +"seconds to run") 
        file.write("\n"+str(datetime.datetime.now())+": < Insert useful statistics about time distributions here? >") 
        file.write("\n"+str(datetime.datetime.now())+": First installation and test: "+str(installAndTest_duration))
        file.write("\n"+str(datetime.datetime.now())+": Checkout: "+str(checkout_duration))
        file.write("\n"+str(datetime.datetime.now())+": Import and evaluation: "+str(import_and_eval_duration))
        file.write("\n"+str(datetime.datetime.now())+": Semantic Unit identification: "+str(SUI_duration))
        file.write("\n"+str(datetime.datetime.now())+": Export: "+str(export_duration))
        file.write("\n"+str(datetime.datetime.now())+": Analysis: "+str(analysis_duration))
        file.write("\n"+str(datetime.datetime.now())+": Merge: "+str(merge_duration))
        file.write("\n"+str(datetime.datetime.now())+": Final installation and test: "+str(final_installation_duration))
        file.write("\n"+str(datetime.datetime.now())+" * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ")
        
    #### Finish workflow ####
    print(" ### Code transplantation finished sucessfull! ### ")
    print("This iteration took "+ str(time.time() - start_iteration) +"seconds to run")
    print(" ### Please compile the code to check for duplicate identifiers ### ")    
 
        
#TODO Scan for occurences of re-defined strings? Locally and in the whole project? This has to be done after SU and Target were merged! 
#TODO Syntax check?  
     

#### Helper functions ####

# Creates all needed repositories
def createRepos():    
    repoURL = input("Please type in the url to your Git repository \n") 
    print("Set donor repo to: "+repoURL+".")

    # Get Donor    
    donorCommit = input("Please type in the commit id of the version of the software that contains the desired functionality (Donor) \n")    
    print("Set commit id to: "+donorCommit+".")
    
    os.system("git clone "+repoURL+" "+resultFoldername+"/DonorProjectCode") 
    os.chdir(resultFoldername+"/DonorProjectCode")    
    os.system("git checkout "+donorCommit)  
    #Get back to top level folder
    os.chdir(topLvlDir)
    
    # Get Target
    targetCommit = input("Please type in the commit id of the version of the software that you would like to merge into (Target) \n")   
    print("Set commit id to: "+targetCommit+".")
    
    os.system("git clone "+repoURL+" "+resultFoldername+"/TargetProjectCode") 
    os.chdir(resultFoldername+"/TargetProjectCode")    
    os.system("git checkout "+targetCommit)  
    os.chdir(topLvlDir)
 


# Creates all needed repositories for the EVALUATION mode (do this just once per project)
def createReposForEvaluation(repoURL):
    # Measure timings
    start_checkout = time.time()
    with open("Evaluation/EvaluationStatistics/timings.txt", "a") as file:
        file.write("\n"+str(datetime.datetime.now())+": Starting with checkout of new project...") 
    
    # Get Donor    
    os.system("git clone "+repoURL+" "+resultFoldername+"/DonorProjectCode") 
    
    # Get Target        
    os.system("git clone "+repoURL+" "+resultFoldername+"/TargetProjectCode") 

    # Get timings    
    checkout_duration = time.time() - start_checkout
    print("The initial checkout process took "+ str(checkout_duration) +" seconds")
    with open("Evaluation/EvaluationStatistics/timings.txt", "a") as file:
        file.write("\n"+str(datetime.datetime.now())+": The initial checkout process took "+ str(checkout_duration) +" seconds") 
 

# Checks out the specific commits, installs and tests the projects 
def checkoutCommitsForEvaluation(donorCommit, targetCommit):       
    # Get Donor
    os.chdir(resultFoldername+"/DonorProjectCode")    
    os.system("git checkout "+donorCommit)  
    #Get back to top level folder
    os.chdir(topLvlDir)
    
    # Get Target    
    os.chdir(resultFoldername+"/TargetProjectCode")    
    os.system("git checkout "+targetCommit)  
    #Get back to top level folder
    os.chdir(topLvlDir)     


# Measure size of Donor and Target
def measureSizes():
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
    with open("Evaluation/EvaluationStatistics/sizes.txt", "a") as file:
        file.write("\n"+str(datetime.datetime.now())+": Target size is lines: "+tLines+" and words: "+tWords) 
        file.write(str(datetime.datetime.now())+": Donor size is lines: "+dLines+" and words: "+dWords) 


# Installs projects, runs their tests and measures results 
# TODO automate based on projectList
def setupProjectsForEvaluation(testFolder, testName):      
################################# silver_searcher #############################################################################   
    # Also add the new test to Target to see if it initially fails
    moveSilverSearcherTests(testFolder, testName)
    installSilverSearcher("Donor")
    installSilverSearcher("Target")
################################# silver_searcher end #########################################################################
    


# Installation and test process for the_silver_searcher
def installSilverSearcher(DonorOrTarget):
    # Install DonorOrTarget
    os.chdir(topLvlDir+"/"+resultFoldername+"/"+DonorOrTarget+"ProjectCode")
    os.system("./build.sh")
    os.system("sudo make install")
    # Run DonorOrTarget's tests
    os.chdir("tests/")
    print("* * * Running "+DonorOrTarget+"'s tests. This may take a while... * * * ")
    tests = os.popen("cram -v ./").read()
    # Store test results
    os.chdir(topLvlDir)
    with open("Evaluation/EvaluationStatistics/testResults.txt", "a") as file:    
        file.write("\n"+str(datetime.datetime.now())+": Results for "+DonorOrTarget+": "+tests) 


#Copy SilverSearcher's test(s) from Donor to Target
def moveSilverSearcherTests(testFolder, testName): 
    os.system("cp -v "+topLvlDir+"/"+resultFoldername+"/DonorProjectCode/"+testFolder+testName+" "+topLvlDir+"/"+resultFoldername+"/TargetProjectCode/"+testFolder)

 
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

    #ToDo only tar relevant filetypes
 
    os.system("jess-import "+projectname+"Code "+projectname) 
    
    if EVALUATION:
         with open(topLvlDir+"/Evaluation/EvaluationStatistics/timings.txt", "a") as file:    
            file.write("\n"+str(datetime.datetime.now())+": Import finished. Starting evaluation of CPG.")     
    
    # Validate CPG (this includes creating the ID list that is used by the codeConverter)
#TODO we could skip this step for performance. But then we need to tell the codeConverter the right projectname and ids
    print(" ### Validating CPG of "+projectname+" ### ") 
    # Project name, working directory, path to original source code
    evaluateProject(projectname, topLvlDir+"/"+resultFoldername , topLvlDir+"/"+resultFoldername+"/"+projectname+"Code") 
    


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
                                if lastLineIsExclusive and addIfdefAroundSU:
                                    #Add the #endif after the index of the last SU exclusive line (which ends the block)
                                    mergeResult[filename].insert(anchorIndex+1, "#endif\n")
                                    #Also add an empty line to the copy, to keep the indices consistent
                                    mergeResultCopy_forSearching.insert(anchorIndex+1, "")
                                
                                #If we added an additional line before the current index, we need to increment the anchor
                                #if anchorIndex < index and lastLineIsExclusive:
                                    #anchorIndex = index +1
                                    #if filename == "ignore.c": print("Incremented anchor: "+str(anchorIndex))
                                #else:
                                #Set the current anchorIndex, so that we insert the SU lines at the right position if possible
                                anchorIndex = index
                                    
                                                                
                                #Set new bools
                                found = True
                                lastLineIsExclusive = False
                                                            
                                #Stops the (inner loop) iteration, as we change the length of the list and do not need to iterate further
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
                                                       
                            #If this is the first line of a SU exclusive block (and the option is enabled), insert an #ifdef
                            if (not lastLineIsExclusive) and addIfdefAroundSU:
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
        
        #Soround the SU code with an ifdef block if this option is enabled
#TODO We could/should add an include statement for a configuarion file here?        
        if addIfdefAroundSU: fileContent = ["#ifdef "+SUName+"\n"]
        else: fileContent = []
        
        #Read current file content (with semantic enhancement)
        with open(topLvlDir+"/"+resultFoldername+"/TargetProjectCode/src/"+fileName, 'r') as file:
            fileContent += file.readlines()
        
        #End the ifdef block of the SU
        if addIfdefAroundSU: fileContent += ["#endif\n"]
        
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
main()
