/**
 * TestBaby Class
 *
 * Copyright (c) [2021], Zhao Liu.
 */

/**
 * The TestBaby class initializes multiple objects and test all the methods
 */
public class TestBaby {
  public static void main(String[] args) {
    // Initialize Baby objects
    Baby firstBaby = new Baby("John", 8, true);
    Baby secondBaby = new Baby("Wendy", 14, false);
    Baby thirdBaby = new Baby("Kevin", 5, true);
    Baby forthBaby = new Baby("Skye", 8, false);

    // Compare age
    if (firstBaby.getAge() < secondBaby.getAge()) {
      System.out.println(firstBaby.getName() + " is younger than " +
      secondBaby.getName() + ".");
    } else if (firstBaby.getAge() > secondBaby.getAge()) {
      System.out.println(secondBaby.getName() + " is younger than " +
      firstBaby.getName() + ".");
    } else {
      System.out.println(firstBaby.getName() + " and " + secondBaby.getName()
      + " are at the same age.");
    }

    // First baby's activities
    firstBaby.feed();
    firstBaby.poop();
    firstBaby.sleep();
    firstBaby.wakeUp();
    firstBaby.feed();
    System.out.println(firstBaby.getName() + " has had " + 
    firstBaby.getEatCount() + " meals."); 

    // Second baby's activities
    secondBaby.sleep();
    secondBaby.pee();
    secondBaby.wakeUp();
    secondBaby.cry();
    System.out.println(secondBaby.getName() + " has napped " + 
    secondBaby.getNapCount() + " time.");

    // Third baby's activities
    thirdBaby.poop();
    thirdBaby.cry();
    if (thirdBaby.isHungry()) {
      thirdBaby.feed();
    }

    // Forth baby's activies
    if(forthBaby.getYawnCount() > 5) {
      System.out.println(forthBaby.getName() + " may be sleepy.");
    }

    // Brief summary 
    System.out.println("There are " + Baby.getBabiesCount() +
    " babies in total, " + Baby.getBlueCount() + " boys and " +
    Baby.getPinkCount() + " girls.");
    System.out.println("They've eaten " + Baby.getEatCountTotal() + " times.");
    System.out.println(Baby.getDiaperUsedTotal() + " diapers are consumed.");
  }
}