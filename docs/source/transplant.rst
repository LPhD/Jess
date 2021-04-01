Semantic Unit Transplantation
=============

Introduction
-------------------------------------

The last step of Jess' workflow is the automated migration of the identified Semantic Unit to a target software (called Target). 
This process is also known as software transplantation (`see this paper <http://crest.cs.ucl.ac.uk/autotransplantation/downloads/autotransplantation.pdf>`_), where code is extracted and transplanted from the Donor to a new Target, 
where Target should recieve additional functionality from Donor.

The workflow.py script realizes an interactive workflow for this scenario.
It contains the functionality of the SUI, codeConverter, and evaluation script. Please take care that all of these scripts are not in manual mode, the last line of the scripts has to be commented out.
Furthermore, the workflow script clones the desired versions from Donor and Target from a Git repository, and allows to automate the whole migration process.
Currently, the configuration of the Semantic Unit identification process must still be set manually in the SUI script. 
However, the default configuration is sufficient for this process.



How to Use
--------------

First, you have to start the jess-server (Terminal 1) and then open a new terminal (Terminal 2) and navigate to the customScripts folder. There, you can invoke the workflow script.

Terminal 1:

.. code-block:: none

    cd $JESS
    ./jess-server.sh


Terminal 2:

.. code-block:: none

    cd $JESS/customScripts
    python3 workflow.py

You were now asked if you would like to work with a new project or to keep the last one. 

If you choose (1), all results were deleted and you were asked to provide the URL for the Git repository (e.g. https://github.com/LPhD/EvoDiss.git) of the software you would like to work with.
Then you need to specify the branch name of the Donor (here you identify the Semantic Unit) and the Target (this is where the Semantic Unit is merged into). Both branches must currently belong to the same repository.
After the code is cloned, Donor is imported as Code Property Graph with the project name "DonorProject".

If you choose (2), the last step is skipped. This means in particular the imported DonorProject stays the same (including node IDs).

The next step is the invocation of the Semantic Unit Identification script. The only difference is that you have to choose DonorProject as input.

After the Semantic Unit is identified, it is automatically transplanted into Target. Therefore, the code of the Semantic Unit is inserted at suitable places of Target. 
However, some fine polishing of the result is necessary, as the transplantation process does not solve conflicts or does not always know the right order of statements. 
In the future, it is planned to use Search Based Software Engineering techniques to automate this step as well.


Configuration Options
--------------


- EVALUATION 
    - Enable to activate the evaluation mode. This mode includes installation and running tests of pre-defined projects, measuring timings and project/SU's sizes. Therefore it is much slower. This mode is not needed for the normal usage of the workflow script.

- addIfdefAroundSU 
    - Activate to add an "#ifdef $SUName" block around the SU's code in Target
    
- SUName 
    - Name of the configuration option to de/enable the SU
