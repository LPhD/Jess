/*File: aSndr.c */
#include "drvUtls.h"
#include "valCmp.h"
#include "Sndr.h"

#ifdef analogueSender
	int sendASignal(int *signal){
		int var = utilFunction(&signal);
		doSomethingImportant(var);
		return var;
	}
#endif
