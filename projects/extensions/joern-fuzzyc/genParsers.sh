#!/bin/bash
antlr4='java -jar lib/antlr4-4.5.3.jar'

$antlr4 src/main/java/antlr/Module.g4
$antlr4 src/main/java/antlr/Function.g4
