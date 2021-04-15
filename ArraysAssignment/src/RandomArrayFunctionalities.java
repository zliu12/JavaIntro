/**
 * Class - RandomArrayFunctionalities
 *
 * Copyright (c) [2021], Zhao Liu.
 */

import java.util.Scanner;

public class RandomArrayFunctionalities {
	/**
	 * Method receives the user-input number
	 * @return: user-input number
	 */
	public int getNum() {
		Scanner in = new Scanner(System.in);
		return in.nextInt();
	}

	/**
	 * Method receives the user-input string
	 * @return: user-input string
	 */
	public String getStr() {
		Scanner in = new Scanner(System.in);
		return in.next();
	}

	/**
	 * Method asks the user to input each element in the array
	 * @param size
	 */
	public void getArrayElement(int[] array, int size) {
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < size; ++i) {
			System.out.print("Please enter the value of element " + (i + 1) + ": ");
			array[i] = in.nextInt();
		}
	}

	/**
	 * Method sort the input array in ascending order
	 * @param array: the array before sorting
	 */
	public void sortArray(int[] array) {
		for (int i = 0; i < array.length - 1; ++i) {
			for (int j = 0; j < array.length - i - 1; ++j) {
				// For every two adjacent numbers, swap their position if the previous
				// number if larger than the number after
				if (array[j] > array[j + 1]) {
					int tmp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tmp;
				}
			}
		}
	}

	/**
	 * Method checks to see if one array is a subset of another array
	 * @param arrayA: the first array
	 * @param arrayB: the second array
	 * @return: true if one array is a subset of another array
	 */
  public boolean ifSubset(int[] array1, int[] array2) {
		// Create a counter to record the time of finding the same elements in
		// array1 and array2
		int counter = 0;

		// Check for empty set, an empty set is a subset of any set
		if (array1.length == 0 || array2.length == 0) {
			return true;
		}

		// Sort two arrays into the ascending order
		sortArray(array1);
		sortArray(array2);

		// Use nested loop compare each elment in array1 with elements in array2,
		// increase counter by 1 if the same elements are found
		int inner = 0;
		for (int i = 0; i < array2.length; ++i) {
			while (inner < array1.length) {
				if (array1[inner] == array2[i]) {
					counter++;
					break;
				}
				inner++;
			}
			inner++;
		}

		// If counter equals to the length of array1 or array2, it confirms that
		// one array is a subset of the other one
		return counter == array1.length || counter == array2.length;
	} 

	String printBack(String inputStr, int inputNum) {
		// If the inputNum is negative or larger than the string length
		if (inputNum < 0 && inputStr.length() < inputNum) {
			return "Num needs to be less than or equal to the string word length.";
		}

		// Create a char array with the length of string length
		char [] strArray = new char[inputStr.length()];

		// Assign values into strArray
		for (int i = 0; i < inputStr.length(); ++i) {
			strArray[i] = inputStr.charAt(i);
		}

		// Create a string builder
		StringBuilder newStr = new StringBuilder();
		// Create a counter variable, set it to inputNum
		int counter = inputNum;
		
		// Use nested loop to have newStr append values from strArray
		for (int i = 0; i < inputNum; ++i) {
			for (int j = 0; j < counter; ++j) {
				newStr.append(strArray[j]);
			}
			counter--;
		}

		return newStr.toString();
	}
}