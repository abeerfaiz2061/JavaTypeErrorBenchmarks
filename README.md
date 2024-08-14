# Collecting Benchmarks for Type Incorrect Java Programs
This repository contains the codebase for my dissertation titled "**Collecting Benchmarks for Type Incorrect Java Programs**." The goal of this project is to collect benchmarks for Java programs that contain compile-time type errors and evaluate how different Java compilers handle these errors. The three compilers used in this study are:

* Oracle's javac Compiler
* Eclipse's ecj Compiler
* JastAdd's ExtendJ Compiler


## **Repository Structure**

The repository is organized as follows:

* /Feature(ie Generics):
  * This directory contains all the Java programs that are intentionally type incorrect, focusing on a specific Java language feature (e.g., Generics).
  * Each subdirectory corresponds to a particular feature of Java and contains:
    * Java Source Files: The benchmark Java programs with type errors.
    * BatchScript: A script to compile the Java programs using the three compilers (javac, ecj, and ExtendJ) and store the resulting error messages.
    * Output Files: The script generates a text file for each Java program (e.g., FileName.txt) that stores the error messages output by each compiler.
