/*File: aSndr.c */
#include "drvUtls.h"
#include "valCmp.h"

#ifdef analogueSender
	int sendASignal(int signal){
		int var = utilFunction(signal);
		doSomethingImportant(var);
		return var;
	}
#endif
