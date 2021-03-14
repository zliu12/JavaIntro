/**
 * Chapter 1 - Lecture.
 *
 * Copyright (c) [2021], Zhao Liu.
*/

/* Computer Program
1. Sequence of instructions and decisions
2. Computer's job is to execute instructions
3. Programming is the act of designing and implementing computer programs
   /applications
4. Programs are made to run instrutions */

/* Anatomy of a Computer
1.Central processing unit: CPU, performs program control and data processing
2.Radom Access Memory: RAM, storage devices, secondary storage(USB, CD, hard disk)
3.Input/Output devices: keyboard, screen, mouse, printer */

/* Java
1.James Gosling & Patrick Naughton in 1996
2.High level language
3.OOP
4.Compiled language
5.Java virtual machine (JVM makes Java portable)
6.Need SDK(Java veresion of SDK is called JDK) to program/compile/build in Java */

/* Java Libraries
1.Huge collection of handy software packages: graphics, UI, networking, sound,
  database, math, etc
2.Code written by someone else, utilized during Java application development */

// Public class name must match the file name
// All Java program has to have at least one main method, can have multiple
import java.util.Scanner;
public class Chp1 {
   // reads user's input
   public static Scanner sc = new Scanner(System.in);
   // String[] is the name of argument, args are the arguments
   public static void main(String[] args) {
      int a = 45;
      int b = 55;
      // System is the package, out is the class, println is the method
      System.out.println("Hello World!");
      System.out.print("a + b = ");
      System.out.println(a + b);
   }
}

/* Algorithms
1.Simply are plans describe the steps to solve a specific problem */

/* Pseudocode
1.A sequence of steps
2.Half-way between natural language and a programming language, can be translated
  to code easily */