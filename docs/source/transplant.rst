Semantic Unit Transplantation
=============

Introduction
-------------------------------------

The last step of Jess' workflow is the automated migration of the identified Semantic Unit to a target software (called Target). 
This process is also known as software transplantation (see http://crest.cs.ucl.ac.uk/autotransplantation/downloads/autotransplantation.pdf), where code is extracted and transplanted the Donor to a new target, 
where Target should recieve additional functionality from Donor.

The workflow.py script realizes an interactive workflow for this scenario.
It contains the functionality of the SUI, codeConverter and evaluation script.
Furthermore, the workflow script clones the necessary Git branches from Donor and Target and allows to automate the whole migration process.
Currently, the configuration of the Semantic Unit identification process must still be set manually in the SUI script.



How to Use
--------------

First, you have to start the jess-server (terminal 1) and then open a new terminal (terminal 2) and navigate to the customScripts folder. There, you can invoke the workflow script.
Note that the server needs to be restarted before each use of the script. Furthermore, the top level source code folder must be called src (this requirement should be omitted in the future).

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

The next step is the invocation of the .. toctree:: slicing .. script. The only difference is that you have to choose DonorProject as input.

After the Semantic Unit is identified, it is automatically transplanted into Target. Therefore, the code of the Semantic Unit is inserted at suitable places of Target. 
However, some fine polishing of the result is necessary, as the transplantation process does not solve conflicts or does not always know the right order of statements. 
In the future, it is planned to use Search Based Software Engineering techniques to automate this step as well.

