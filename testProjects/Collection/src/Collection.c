#include <stdio.h>
#include <stdlib.h>
#include "InclC.c"
#include "InclH.h"

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

	return EXIT_SUCCESS;
}
