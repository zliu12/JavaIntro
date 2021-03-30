/**
 * testRandomFunctionalities Class
 *
 * Copyright (c) [2021], Zhao Liu.
 */

public class testRandomFunctionalities {
  public static void main(String[] args) {
    // Declare test as the new RandomFunctionalities object
    RandomFunctionalities test = new RandomFunctionalities();

    // Test Method putTogether
		System.out.println("rescue, elephants: " + test.putTogether("rescue", "elephants"));  // rescuelephant
		System.out.println("Java, apple: " + test.putTogether("Java", "apple"));              // Javapple
    System.out.println("pop, eyes: " + test.putTogether("pop", "eyes"));                  // popeyes

    // Test method swapThree
    System.out.println("JavA: " + test.swapThree("JavA"));      		  // JAva
    System.out.println("fun: " + test.swapThree("fun"));        		  // nuf
    System.out.println("is: " + test.swapThree("is"));          		  // si
    System.out.println("a: " + test.swapThree("a"));            		  // a
    System.out.println(" : " + test.swapThree(" "));            		  // Nothing

    // Test method overEleven
    System.out.println("1, 2, 38: " + test.overEleven(1, 2, 38));     // true 
    System.out.println("3, 40, 4: " + test.overEleven(3, 40, 4));     // true
    System.out.println("42, 5, 6: " + test.overEleven(42, 5, 6));     // true
    System.out.println("10, 5, 6: " + test.overEleven(10, 5, 6));     // false

    // Test method isOdd
    System.out.println("777 is odd: " + test.isOdd(777));       		  // true
    System.out.println("888 is odd: " + test.isOdd(888));       		  // false
    System.out.println("-1 is odd: " + test.isOdd(-1));         		  // true
    System.out.println("0 is odd: " + test.isOdd(0));           		  // false

    // Test method isEven
    System.out.println("77 is even: " + test.isEven(77));       		  // false
    System.out.println("88 is even: " + test.isEven(88));       		  // true
    System.out.println("-2 is even: " + test.isEven(-2));       		  // true
    System.out.println("0 is even: " + test.isEven(0));         		  // true

    // Test method twentyOne
    System.out.println("15, 16: " + test.twentyOne(15, 16));    		  // 16
    System.out.println("14, 13: " + test.twentyOne(14, 13));    		  // 14
    System.out.println("22, 12: " + test.twentyOne(22, 12));    		  // 12
    System.out.println("22, 21: " + test.twentyOne(22, 21));    		  // 21
    System.out.println("21, 21: " + test.twentyOne(21, 21));    		  // -1
    System.out.println("22, 22: " + test.twentyOne(22, 22));    		  // -1
    System.out.println("12, 12: " + test.twentyOne(12, 12));    		  // -1    
	}
}
