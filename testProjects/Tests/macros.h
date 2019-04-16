#ifndef __LINUX_KCONFIG_H
#define __LINUX_KCONFIG_H
#include "Config.h"

/*
 * Helper macros to use CONFIG_ options in C/CPP expressions. Note that
 * these only work with boolean and tristate options.
 */

/*
 * Getting something that works in C and CPP for an arg that may or may
 * not be defined is tricky.  Here, if we have "#define CONFIG_BOOGER 1"
 * we match on the placeholder define, insert the "0," for arg1 and generate
 * the triplet (0, 1, 0).  Then the last step cherry picks the 2nd arg (a one).
 * When CONFIG_BOOGER is not defined, we generate a (... 1, 0) pair, and when
 * the last step cherry picks the 2nd arg, we get a zero.
 */
#define __ARG_PLACEHOLDER_1 0,
#define config_enabled(cfg) _config_enabled(cfg)
#define _config_enabled(value) __config_enabled(__ARG_PLACEHOLDER_##value)
#define __config_enabled(arg1_or_junk) ___config_enabled(arg1_or_junk 1, 0)
#define ___config_enabled(__ignored, val, ...) val

/*
 * IS_ENABLED(CONFIG_FOO) evaluates to 1 if CONFIG_FOO is set to 'y' or 'm',
 * 0 otherwise.
 *
 */
#define IS_ENABLED(option) \
	(config_enabled(option) || config_enabled(option##_MODULE))

/*
 * IS_BUILTIN(CONFIG_FOO) evaluates to 1 if CONFIG_FOO is set to 'y', 0
 * otherwise. For boolean options, this is equivalent to
 * IS_ENABLED(CONFIG_FOO).
 */
#define IS_BUILTIN(option) config_enabled(option)

/*
 * IS_MODULE(CONFIG_FOO) evaluates to 1 if CONFIG_FOO is set to 'm', 0
 * otherwise.
 */
#define IS_MODULE(option) config_enabled(option##_MODULE)

#endif /* __LINUX_KCONFIG_H */

#ifndef MACROS_H_
#define MACROS_H_

#define MAKRO(y) MAKRO2(y##1)
#define MAKRO2(y) MAKRO3(y##2)
#define MAKRO3(y) y##3


// Macros to support option testing (from Marlin)
#define _CAT(a, ...) a ## __VA_ARGS__
#define SWITCH_ENABLED_false 0
#define SWITCH_ENABLED_true  1
#define SWITCH_ENABLED_0     0
#define SWITCH_ENABLED_1     1
#define SWITCH_ENABLED_      1
#define ENABLED(b) _CAT(SWITCH_ENABLED_, b)
#define DISABLED(b) (!_CAT(SWITCH_ENABLED_, b))

void testMacros();

#endif /* MACROS_H_ */

#include <stdio.h>
#include <stdlib.h>
#include "Macros.h"
#include "kconfig.h"
#include "Config.h"

//Test method for macros and partial preprocessor in pure::variants
void test (){

//True for Selection of Feature_A
#if (defined(Feature_A) && (MAKRO(7) > 7))
	puts("\nFeature A and Macro");
#endif

//True for Selection of Feature_B
#if (defined(Feature_B) && (MAKRO(7) > 7))
	puts("\nFeature B and Macro");
#endif

//Never true
#if (defined(Feature_A) && !(MAKRO(7) > 7))
	puts("\nFeature A and not Macro");
#endif

//Always true
#if (defined(Feature_A) || (MAKRO(7) > 7))
	puts("\nFeature A or Macro");
#endif

//True for Selection of Feature_A
#if defined(Feature_A)
	puts("\nFeature A");
#endif

}

//Test method for macros and partial preprocessor
void testMacros(){

//True for selection of BUBBLE
#if(MAKRO(7) > 7) && (IS_ENABLED(BUBBLE) && ENABLED(BUBBLE))
	printf("Die Zahl ist: %i", MAKRO(7));
	//True for selection of BUBBLE
	#ifdef BUBBLE
		puts("\nBubble und Makro!");
	#endif
//False for selection of BUBBLE
#else
	puts("Fehler!");
	//True for define of BUBBLE (def BUBBLE, not def BUBBLE 1)
	#ifdef BUBBLE
		puts("\nBubble ohne Makro!");
	#endif
#endif

//True if BUBBLE == 1
#if IS_ENABLED(BUBBLE)
	printf("\nMakro IS_ENABLED: %i",IS_ENABLED(BUBBLE));
#endif
//True if BUBBLE == 1
#if ENABLED(BUBBLE)
	printf("\nMakro ENABLED: %i",ENABLED(BUBBLE));
#endif

	printf("\nMakro MAKRO(7): %i",MAKRO(7));

#ifdef BUBBLE2
	puts("\nBubble2 selected!");
#endif

	test();
}

