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

## **Usage**

To run this project on your machine, follow these steps:

* Ensure Java is Installed:
  
  Make sure you have Java installed on your local machine. The scripts were tested using Java 8, but they should work with other versions as well. Note the following:

  * Generics were introduced in Java 5, so the minimum Java version required to run these programs is Java 5.
  * ExtendJ supports Java versions up to 11.
  * You can use higher Java versions for javac and ecj.
* Download Required JAR Files:

  * ECJ JAR: Download the Eclipse ECJ compiler JAR file.
  * ExtendJ JAR: Download the ExtendJ JAR file.
* Update Script Paths:
  
  Before running the batch scripts, update the paths to the ecj and ExtendJ JAR files in the script. 
