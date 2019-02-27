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

#ifdef foo
#else
	#ifdef foo
	#else
	#endif
#endif

#if foo
bar();
#else
foo();
foo();
#endif

#if foo
int i;
#endif

#if foo
bar();
#elif  bar
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

#ifdef foo
#else
	#ifdef foo
	#else
	#endif
#endif

#if foo
bar();
#else
foo();
foo();
#endif

#if foo
int i;
#endif

#if foo
bar();
#elif  bar
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
