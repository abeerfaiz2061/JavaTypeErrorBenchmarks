# Collecting Benchmarks for Type Incorrect Java Programs
This repository contains the codebase for my dissertation titled "**Collecting Benchmarks for Type Incorrect Java Programs**." The goal of this project is to collect benchmarks for Java programs that contain compile-time type errors and evaluate how different Java compilers handle these errors. The three compilers used in this study are:

* Oracle's javac Compiler
* Eclipse's ecj Compiler
* JastAdd's ExtendJ Compiler

In this research, we focused on the following Java language specification features:

* Generics and Type Parameters
* Covariance
* Contravariance
* Wildcards
* Capture Conversions
* Variable Arity Methods

These features were chosen due to their complexity and potential to introduce type-related errors, making them ideal for benchmarking and analysis across different compilers.

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
  Make sure you have Java installed on your local machine. The scripts were tested using Java 8, but they should work with other versions as well.
  Note the following:
  * Generics were introduced in Java 5, so the minimum Java version required to run these programs is Java 5.
  * ExtendJ supports Java versions up to 11.
  * You can use higher Java versions for javac and ecj.
* Download Required JAR Files:
  * ECJ JAR: Download the Eclipse ECJ compiler JAR file.
  * ExtendJ JAR: Download the ExtendJ JAR file.
* Update Script Paths:
  Before running the batch scripts, update the paths to the ecj and ExtendJ JAR files in the script.

## **Licensing**
This repository is unlicensed, meaning there is no formal license attached to the project. However, you are welcome to use, modify, and distribute the code for any purpose, including both academic and commercial applications. While a formal license isn't provided, please consider acknowledging this repository if it significantly contributes to your work.

## **Reusing Code**
Feel free to reuse, modify, or extend the code in this repository for any purpose. You have full freedom to integrate it into your projects, research, or any other applications. If you find this code helpful, consider giving credit to this repository.

## **Contribution**
Contributions to this research are highly encouraged. If you're interested in building upon this work, here are some ways you can contribute:

 * Introduce New Benchmarks:
   * Contribute by adding new Java programs that explore additional Java language specification features beyond those currently included, such as Lambdas, Streams, etc.
 * Expand Compiler Support:
   * If you wish to explore how other Java compilers handle type errors, feel free to add support for new compilers and share your results.
 * Enhance the Scripts:
   * Improvements to the batch scripts that increase their efficiency, usability, or functionality are always welcome.

## **Acknowledgments**
I would like to acknowledge and give credit to the original authors of the code that contributed to the foundation of this project. Their work has significantly contributed to the development of this project:

* [kousen/generics](https://github.com/kousen/generics)
* [amigoscode/java-generics](https://github.com/amigoscode/java-generics)
* [vivin/GenericTree](https://github.com/vivin/GenericTree)
* [RameshMF/java-generics-guide](https://github.com/RameshMF/java-generics-guide)
* [c05mic/GenericN-aryTree](https://github.com/c05mic/GenericN-aryTree)
* [custersnele/JavaAdv_H5_Generics](https://github.com/custersnele/JavaAdv_H5_Generics)
* [hellojavaio/Java-Generics-and-Collections-2](https://github.com/hellojavaio/Java-Generics-and-Collections-2)
* [Corrective hints for type incorrect generic Java programs](https://dl.acm.org/doi/abs/10.1145/1706356.1706360)
* [Improving type error messages for generic Java](https://www.researchgate.net/publication/220989982_Improving_type_error_messages_for_generic_Java)
* [Java Generics Capture Conversion](https://www.geekyarticles.com/2011/11/java-generics-capture-conversion.html)
