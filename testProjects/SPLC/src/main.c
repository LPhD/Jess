#include <stdio.h>
#include <stdlib.h>
#include "aSndr.h"


int main(void) {
	int output = sendASignal(5);
	printf("The result is %d", output);
	return EXIT_SUCCESS;
}
