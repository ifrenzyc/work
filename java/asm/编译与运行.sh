#!/bin/bash

# PWD=asm/
cd src/com/yangc/asm

javac  Example.java
javac -cp .;../../../../lib/asm-all-4.0.jar;../../../../src AsmHelloworld.java

cd ../../../

java -cp .;../lib/asm-all-4.0.jar com.yangc.asm.AsmHelloworld
