#!/usr/bin/env python3
from octopus.server.DBInterface import DBInterface
import subprocess
import os
import shutil

# Get current path
topLvlDir = os.getcwd()

print(" ### Welcome to the interactive code migration workflow ### ")
print(" ### Prerequisite 1: Version control with Git ### ")
print(" ### Prerequisite 2: Jess server is (re-)started before running the script ### ")

#Import new branches or reuse old ones?
reuse = input("Would you like to work with a new project (1) or keep the last one (2) ?\n")


if (reuse == "1"):
    # Add folder to work with
    resultFoldername = "Results"
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
import SUI 


# SU to code
print(" ### Convert SU back to source code ### ")
from codeConverter import convertToCode




#ToDo: Analysis steps.

# Scenario analysis?
## Sc 1: Diff SU vs target
### Only additions of SU -> Just add them to target, we are finished ###
### Otherwise:
## Sc 2: Diff SU vs origin
###

# Addition of variability?




