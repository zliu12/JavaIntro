/**
 * Class - CashRegister
 *
 * Copyright (c) [2021], Zhao Liu.
 */

public class CashRegister {
  private int numOf100s;             // Number of 100-dollar bills
  private int numOf50s;                  // Number of 50-dollar bills
  private int numOf20s;                 // Number of 20-dollar bills
  private int numOf10s;                    // Number of 10-dollar bills
  private int numOf5s;                   // Number of 5-dollar bills
  private int numOf1s;                    // Number of 1-dollar bills 
  private double itemCount;                 // Number of items
  private double itemPrice;                 // Price of one item            
  private double coinTotal;                 // Total amount of coins
  private double cashInBills;               // Total amount of bills
  private double cashRegisterTotal;         // Total cash in register
  
  private static double allCoinTotal = 0;
  private static double allCashInBills = 0;
  private static double allCashRegisterTotals = 0;

  /**
   * Constructor: create the object with number of different bills and coins
   */
  CashRegister(int numOf100s, int numOf50s, int numOf20s, int numOf10s,
               int numOf5s, int numOf1s, double coinTotal) {
    this.numOf100s = numOf100s;
    this.numOf50s = numOf50s;
    this.numOf20s = numOf20s;
    this.numOf10s = numOf10s;
    this.numOf5s = numOf5s;
    this.numOf1s = numOf1s;
    this.coinTotal = coinTotal;
    this.cashRegisterTotal = (double)100 * numOf100s + 50 * numOf50s +
                                     20 * numOf20s + 10 * numOf10s + 
                                     5 * numOf5s + 1 * numOf1s + coinTotal;
  }

  /**
   * Constructor: create the object with the total cash in this register
   */
  CashRegister(double cashInBills, double coinTotal) {
    this.cashRegisterTotal = cashInBills + coinTotal;
  }

  /**
   * Method gets the total number items of one register
   * @return total number of items
   */
  public double getItemCount() {
    return itemCount;
  }

  /**
   * Method changes the total cash WRT the change to item count
   * @param quantity: number of item added
   */
  public void addItem(double quantity) {
    itemCount += quantity;
    cashRegisterTotal += getItemCount() * getItemPrice();
  }

  /**
   * Method changes the total cash WRT the change to item count
   * @param quantity: number of item removed
   */
  public void removeItem(double quantity) {
    itemCount -= quantity;
    cashRegisterTotal -= getItemCount() * getItemPrice(); 
  }

  /**
   * Method gets the price of the item
   * @return the price of the item
   */
  public double getItemPrice() {
    return itemPrice;
  }

  /**
   * Method gets the number of 100-dollar bills
   * @return number of one hundreds
   */
  public double getOneHundreds() {
    return numOf100s;
  }

  /**
   * Method gets the number of 50-dollar bills
   * @return number of fiftys
   */
  public double getFiftys() {
    return numOf50s;
  }

  /**
   * Method gets the number of 20-dollar bills
   * @return number of twentys
   */
  public double getTwentys() {
    return numOf20s;
  }

  /**
   * Method gets the number of 10-dollar bills
   * @return number of tens
   */
  public double geTens() {
    return numOf10s;
  }  

  /** Method gets the number of 5-dollar bills
   * @return number of fives
   */
  public double getFives() {
    return numOf5s;
  }

  /**
   * Method gets the number of 1-dollar bills
   * @return number of ones
   */
  public double getOnes() {
    return numOf1s;
  }

  /**
   * Method gets the total amount of cash in one register
   * @return total cash
   */
  public double getCashRegisterTotal() {
    return cashRegisterTotal;
  }

  /**
   * Method gets the total amount of cash in all registers
   * @return total cash in all registers
   */
  public static double getAllCashRegisterTotals() {
    return allCashRegisterTotals;
  }

  /**
   * Method resets the total amount of cash in one register to 0
   */
  public void clear() {
    cashRegisterTotal = 0;
  }

  /**
   * Method resets the total amount of cash in all registers to 0
   */
  public static void clearAll() {
    allCashRegisterTotals = 0;
  }
  
}