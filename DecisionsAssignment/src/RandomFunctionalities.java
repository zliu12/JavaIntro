/**
 * RandomFunctionalities Class
 *
 * Copyright (c) [2021], Zhao Liu.
 */

public class RandomFunctionalities {
  /**
   * Method concatenates two string words except if two equal letters are
   * created when put together
   * @param firstWord: the first word
   * @param secondWord: the second word
   * @return the first and second word together
   */
  public String putTogether(String firstWord, String secondWord) {
    int len1 = firstWord.length();
    int len2 = secondWord.length();
    String strTogether;

    // Check if the last character of firstWord is the same as the first
    // character of secondWord
    if (firstWord.charAt(len1 - 1) == secondWord.charAt(0)) {
      strTogether = firstWord + secondWord.substring(1, len2);
    } else {
      strTogether = firstWord + secondWord;
    }

    return strTogether;
  }

  /**
   * Method swaps the word's last three letters in reverse order
   * @param word: the word to be changed
   * @return the word with the last three letters in reverse order
   */
  public String swapThree(String word) {
    // Convert word to char array
    char[] wordCharArray = word.toCharArray();
    int len = word.length();

    // Check the length of word
    if (len == 3) {
      char temp = wordCharArray[2];
      wordCharArray[2] = wordCharArray[0];
      wordCharArray[0] = temp;
    } else if (len == 2) {
      char temp = wordCharArray[0];
      wordCharArray[0] = wordCharArray[1];
      wordCharArray[1] = temp;
    } else if (len > 3) {
      char temp = wordCharArray[len - 1];
      wordCharArray[len - 1] = wordCharArray[len - 3];
      wordCharArray[len - 3] = temp;
    }

    // Convert char array back to a string
    return new String(wordCharArray);
  }

  /**
   * Method tests if any one of the three integers is over than the sum of the
   * other two integers by 11 or more
   * @param first: the first integer
   * @param second: the second integer
   * @param third: the third integer
   * @return true or false
   */
  public boolean overEleven(int first, int second, int third) {
    // Find difference between one integer and the sum of the other two integers
    int diff1 = third - first - second;
    int diff2 = second - first - third;
    int diff3 = first - second - third;

    return (diff1 >= 11 || diff2 >= 11 || diff3 >= 11);
  }

  /**
   * Method tests if an integer is odd
   * @param number: the number to be tested
   * @return true or false
   */
  public boolean isOdd(int number) {
    return ((Math.abs(number) % 2) == 1);
  }

  /**
   * Method tests if an integer is even
   * @param number: the number to be tested
   * @return true of false
   */
  public boolean isEven(int number) {
    return ((Math.abs(number) % 2) == 0);
  }

  /**
   * Method returns the maximum integer that's smaller than or equal to 21
   * @param firstNumber: the first integer
   * @param secondNumber: the second integer
   * @return -1 two integers are equal or go over 21, otherwise the max integer
   */
  public int twentyOne(int firstNumber, int secondNumber) {
    int result = 0;

    if (firstNumber == secondNumber) {
      result = -1;
    } else if (firstNumber > 21 && secondNumber > 21) {
      result = -1;
    } else if (firstNumber > 21 && secondNumber <= 21) {
      result = secondNumber;
    } else if (firstNumber <= 21 && secondNumber > 21) {
      result = firstNumber;
    } else if (firstNumber < 21 && secondNumber < 21 && firstNumber < secondNumber) {
      result = secondNumber;
    } else {
      result = firstNumber;
    }

    return result;
  }
}