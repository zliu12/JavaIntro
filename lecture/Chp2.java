package lecture;

/**
 * Chapter 2 - Lecture
 *
 * Copyright (c) [2021], Zhao Liu.
*/

/* Review
1. Synatx
  a. General there's only 1 main
2. Error
  a. Compile-time errors
  b. Run-time errors
3. Algorithm */

/* Chapter 2
1. Var
  a. pretty much like C++
  b. Once declared, type can't be changed
  c. Camel casing
2. Naming
3. Constant
  a. keyword final: final double BOTTLE_VOLUME = 2; 
4. Comments
  a. single line //
  b. multi-line 
  c. multi-line javadoc comments, especially on a method
 */

/* Objects
1. In Java, build programs from objects
2. Obj has behaviors, manipulate obj to get certain effects
3. Obj has methods, System.out has a println method
 */

/* Classes
1. May or may not have main method
2. Describes a set of obj with the same behavior
3. System.out is a member of the PrintStream class, all PrintStream objs have
   methods println and print
4. Using import java.<class_name>.<object_name>
5. Package means to group all classes together in library
 */

/* Calling Methods
1. Use an obj by calling its methods
2. All objs of a given class share a common set of methods
3. println vs print
*/

/* The Public Interface of a Class
*/

/* Method
1. Sequence of instructions with a name
2. Create methods to build the class, then build the obj
3. May have a uppercase name and a dot be4 them
4. () - a set of parenthesis at the end, a place to provide input/argument
5. Usually return sth if not void type
6. What does it need to do and what does it answer with, what expected result,
what to pass in, what type to return
7. Keyword public: method visible from classes in other packages; 
keyword private: method belongs to the class that owns the method
8. Keyword static: associated to the class and not an instance; you don't have
to create an obj of the class; static var is shared across the class
 */

 /* Return value
 1. No multiple return types/values */

 /* How to implement a method
 1. What the method should od
 2. Inputs/parameters
 3. type of parameters and return values
 4. Pseudocode
 5. Implement body
 6. Test 
 7. Make the method as general as possbile, write once, then reuse, DIY */



/**
 * This is a javadoc comment
 * @param args
 */ 
public class Chp2 {
  public static void main(String[] args) {
    int sum = 0;
    func(sum);  // void type, sum no change
    System.out.println(sum);  // sum still 0
  }

  public static int func(int a) {
    for (int i = 0; i < 10; i++) {
      a += i;
    }
    return a;
  }
}