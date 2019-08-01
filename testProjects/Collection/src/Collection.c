#include <stdio.h>
#include <stdlib.h>
#include "InclC.c"
#include "InclH.h"

#ifdef A
	#error "A is defined"
#elif B
	#line 5
	#pragma  GCC poison B
#else
	#null
#endif

int main(void) {
	int i = 0;
	struct scsi_device {
		int x;
	} sdev;
	struct block_device {
		int y;
	} dev;

	FPT_WrStack(1, 1, 1);
	FPT_scwirod(1, 1);
	blogic_diskparam(sdev, dev, 1);

	switch (i) {
	case 1:
		puts("1");
		break;

	case 2:
		puts("2");
		break;

	default:
		puts("Default");
	}

	LOOPLABEL:do {
	   i++;
	   if ( i == 2){
		   goto LOOPLABEL;
	   }
	} while( i < 5 );

	while( i < 5 ) {
	   i++;
	}

	for ( int j = 0; j < 7; j = j + 1){
		i++;
		continue;
	}

	if (i < 3)
		puts("Failure");
	else
		puts("Success");

	return EXIT_SUCCESS;
}
