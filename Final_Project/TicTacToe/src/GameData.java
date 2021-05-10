/**
 * Class - Game Data
 *
 * Copyright (c) [2021], Zhao Liu.
 */

import java.util.Scanner;

 /**
  * This class asks and receives the user inputs of the number of players and 
  * the winning number of pieces in a row
  */
public class GameData {
  private static int playerNum = 0;
  private static int winningNum = 0;
  private static boolean playerNumIsInt = false;

  /**
   * Method accesses the num of players
   * @return: num of players
   */
  public int getPlayerNum() {
    return playerNum;
  }

  /**
   * Method accesses the num to win the game
   * @return: winning number
   */
  public int getWinningNum() {
    return winningNum;
  }

  /**
   * Method takes in and validates the number of players
   * @return: the number of players
   */
  public static void inputNums() {
    Scanner playerInput = new Scanner(System.in);
    
    do {
      askPlayerNUm(playerInput);
    } while (!checkNumOfPlayer(playerNum));

    do {
      askWinningNum(playerInput);
    } while (!checkNumOfWinning(playerNum));
    playerInput.close();
  }

  /**
   * Method asks the user to enter the number of total players
   */
  private static void askPlayerNUm(Scanner in) {
    System.out.print("Please enter the total number of players (from 3 to 10): ");
    playerNum = in.nextInt();
  }

  /**
   * Method asks the user to enter the number of winning the game
   */
  private static void askWinningNum(Scanner in) {
    System.out.print("Please enter the number to win the game (from 3 to player count + 1): ");
    winningNum = in.nextInt();
  }

  /**
   * Methods checks if the input of player numbers is in the range
   * @param numOfPlayer: num to be checked
   * @return: true if the num is in the range, otherwise false
   */
  private static boolean checkNumOfPlayer(int numOfPlayer) {
    return (numOfPlayer > 2 && numOfPlayer < 11);
  }

  /**
   * Method checks the input number of winning
   * @param numOfWinning: num to be checked
   * @return: true if the input is valid, otherwise false
   */
  private static boolean checkNumOfWinning(int winningNum) {
    return (winningNum > 2 && winningNum < playerNum + 1);
  }
}