//============================================================================
// Name        : JoernTests.cpp
// Author      : 
// Version     :
// Copyright   : 
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;
int global;

int main() {
	cout << "!!!Hello World!!!" << endl;
	return 0;
}

void testWhileAndInc() {

	int i = 0;
	while (i > 5){
		i++;
	}

	global = 5;
}

void testMethodCallInFor(){

	for(int i = 0, i < 5, i = addI()){

	}
}

int addI(){
	return ++i;
}
