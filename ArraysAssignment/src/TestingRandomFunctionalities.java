/**
 * Class - TestingRandomFunctionalities
 *
 * Copyright (c) [2021], Zhao Liu.
 */

public class TestingRandomFunctionalities {
  public static void main(String[] args) {
    // Create a RandomArrayFunctionalities object
    RandomArrayFunctionalities test = new RandomArrayFunctionalities();
    
    /* Check if one array is a subset of another array */
    System.out.println("Check array subset: ");
    // Ask the user to input the first array's size
    System.out.print("Please enter the number of elements in the first array: ");
    int size1 = test.getNum();

    // Ask the user to input the value of elements for the first array
    int[] array1 = new int[size1];
    test.getArrayElement(array1, size1);

    // Ask the user to input the second array's size
    System.out.print("Please enter the number of elements in the second array: ");
    int size2 = test.getNum();

    // Ask the user to input the value of elements for the second array
    int[] array2 = new int[size2];
    test.getArrayElement(array2, size2);

    // Check if one array is a subset of the other one
    if (test.ifSubset(array1, array2)) {
      if (size1 < size2) {
        System.out.println("array1 is a subset of array2.");
      }
      else {
        System.out.println("array2 is a subset of array1.");
      }
    }
    else {
      System.out.println("array1 and array2 have no subset-relation.");
    }


    /* Print back string from the number repeatedly until the first char */
    System.out.println("Print back: ");
    // Ask the user to input a number
    System.out.print("Please enter a number: ");
    int num = test.getNum();

    // Ask the user to input a string
    System.out.print("Please enter a string word: ");
    String str = test.getStr();
    
    // Output the printBack result
    System.out.println("New string obtained from " + str + ": " + test.printBack(str, num));
  }
}
