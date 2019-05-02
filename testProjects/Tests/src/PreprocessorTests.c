/* In this file we have all kind of different preprocessor statements, once inside a function and once outside. */

#include <file.h>
#include "something"
#include MACRO
#import <file.h>
#import "something"
#import MACRO
#include_next <file.h>
#include_next "something"
#include_next MACRO

#ifdef foo1
#else
	#ifdef foo2
	#else
	#endif
#endif

#if foo3
#define bar3
#else
#define foo13
#define foo23
#endif

#if foo4
int i;
#endif

#if foo5
#define bar5
#elif  bar6
#define bar16
#define bar26
#endif

#if (foo < 5)
int i;
#endif

#if defined (foo)
int i;
#endif

#if (foo < 5 && ( x < 1 || x > 5 ))
int i;
#endif

#define MACRO
#define MACRO 5
#define MACROA
#define MACROB
#define MACRO(a) a + 5
#define ___config_enabled(__ignored, val, ...) val
#define IS_ENABLED(option) \
				(config_enabled(option) || config_enabled(option##_MODULE))

#undef ___config_enabled

#line 5
#line 5 "Filename"

#error  "This is a test error"
#warning  "This is a test warning"

#ident  "This is a test ident"
#sccs  "This is a test sccs"

#pragma GCC dependency "parse.y"
#pragma GCC dependency "parse.y" This is a test case
#pragma GCC poison printf sprintf fprintf
#pragma GCC system_header
#pragma GCC warning "This is a test warning"
#pragma GCC error "This is a test error"
#pragma once


void testMethod() {
#include <file.h>
#include "something"
#include MACRO
#import <file.h>
#import "something"
#import MACRO
#include_next <file.h>
#include_next "something"
#include_next MACRO

	int x = 0;

#ifdef foo11
	x = 1;
#else
	x = 2;

	#ifdef foo22
	x = x + 1;
	#else
	x = x - 1;
	#endif

	x = x * 3;

#endif

#if foo33
bar();
#else
foo();
foo();
#endif

#if foo44
int i;
#endif

#if foo55
bar();
#elif  bar66
foo();
foo();
#endif

#if (foo < 5)
int i;
#endif

#if defined (foo)
int i;
#endif

#if (foo < 5 && ( x < 1 || x > 5 ))
int i;
#endif

#define MACRO
#define MACRO 5
#define MACROA
#define MACROB
#define MACRO(a) a + 5
#define ___config_enabled(__ignored, val, ...) val
#define IS_ENABLED(option) \
				(config_enabled(option) || config_enabled(option##_MODULE))

#undef ___config_enabled

#line 5
#line 5 "Filename"

#error  "This is a test error"
#warning  "This is a test warning"

#ident  "This is a test ident"
#sccs  "This is a test sccs"

#pragma GCC dependency "parse.y"
#pragma GCC dependency "parse.y" This is a test case
#pragma GCC poison printf sprintf fprintf
#pragma GCC system_header
#pragma GCC warning "This is a test warning"
#pragma GCC error "This is a test error"
#pragma once
}
