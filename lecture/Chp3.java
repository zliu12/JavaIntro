/**
 * Chapter 3 - Lecture
 *
 * Copyright (c) [2021], Zhao Liu.
 */

/* Instantiating Objects
1. Use new operator to construct objects of a class
Counter concertCounter = new Counter();
Counter boardingCounter = new Counter();
2. They belong to different memory locations
 */

/* Instance Variables
1. Store the data of an object
2. Instance of a class:
    An object of the class, class is the template/skeleton of the object
3. Access specifier: instance variables are always private
4. Instance Variables of Objects:
    Each object of a class has a separate sth
 */

/* Accessing instance variables
1. private instance variables cannot be accessed from the methods outside of the
class

Encapsulation:
1. Process of hiding implementation details and providing methods for data access
2. Private data (instance variables), public interface (methods) to access'em

Accessor and Mutator Methods:
1. Accessor: get method, return sth
2. Mutator: modify method

Private Methods:
1. Can only be called by other methods in the same class
2. Not part of the public interface

Constructors:
1. Initialize objects
2. With parameter, without parameter
3. Constructor name has to be the name of the class
4. Default constructor used if no custom constructor: int = 0; str = null;
5. Don't rely on Java default constructor 
6. Mutator: change the instance variables
7. Accessor: bring you the instance variables
 */

/* Unit Testing
1. Verify a class works correctly in isolation, outside a complete program
2. Test class: a class with a main method that contains statements to test another class
3. Step:
    1. Construct objects
    2. Invoke one or more methods
    3. Print out one or more results
    4. Print out the expected results
 */

/* Local Variables
1. Declared within the method, belong to the method
2. Get destroyed when the method finishes
3. Must initialize the local variables
*/

/* Instance Methods*/

/* Implicit and Explicit Parameters */

/* This Reference
1. Refer to the object variable 
*/

/* Errors
1. Not initializing object references in constructor:
    NullPointerException
2. Trying to call a constructor
*/
