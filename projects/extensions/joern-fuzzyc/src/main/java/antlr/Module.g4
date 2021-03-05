grammar Module;

import ModuleLex, Preprocessor, Custom, Expressions, Common, FunctionDef, CoarseSimpleDecl;


@header{
	package antlr;
}

code : (function_def | simple_decl | custom | pre_statement | comment | null_expression | water )*;

