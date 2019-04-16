/*File: aSndr.c */
#include "drvUtls.h"
#include "compUtls.h"
#include "Sndr.h"

#ifdef analogueSender
	void sendASignal(int *signal){
		int var = utilFunction(&signal);
	}
#endif