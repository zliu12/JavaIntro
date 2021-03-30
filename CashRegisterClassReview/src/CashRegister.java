/**
 * Class - CashRegister
 *
 * Copyright (c) [2021], Zhao Liu.
 */

public class CashRegister {
  private int numOf100s;                            // Number of 100-dollar bills
  private int numOf50s;                             // Number of 50-dollar bills
  private int numOf20s;                             // Number of 20-dollar bills
  private int numOf10s;                             // Number of 10-dollar bills
  private int numOf5s;                              // Number of 5-dollar bills
  private int numOf1s;                              // Number of 1-dollar bills 
  private int itemCount;                            // Number of items
  private double itemPrice;                         // Price of one item            
  private double coinTotal;                         // Total amount of coins
  private double cashInBills;                       // Total amount of bills
  private double cashRegisterTotal;                 // Total cash in register
  private static double allCashRegisterTotals = 0;  // Total cash in all register

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
    this.cashInBills = (double)100 * numOf100s + 50 * numOf50s +
                               20 * numOf20s + 10 * numOf10s + 
                               5 * numOf5s + 1 * numOf1s;
    this.cashRegisterTotal = (double)100 * numOf100s + 50 * numOf50s +
                                     20 * numOf20s + 10 * numOf10s + 
                                     5 * numOf5s + 1 * numOf1s + coinTotal;
    allCashRegisterTotals += cashRegisterTotal;
  }

  /**
   * Constructor: create the object with the total cash in this register
   */
  CashRegister(double cashInBills, double coinTotal) {
    this.cashRegisterTotal = cashInBills + coinTotal;
    allCashRegisterTotals += getCashRegisterTotal();
  }

  /**
   * Method sets the number of item count
   * @param itemCount 
   */
  public void setItemCount(int itemCount) {
    this.itemCount = itemCount;
  }

  /**
   * Method gets the total number items of one register
   * @return total number of items
   */
  public int getItemCount() {
    return itemCount;
  }

  /**
   * Method changes the total cash WRT the change to item count
   * @param quantity: number of item added
   */
  public void addItem(int quantity) {
    itemCount += quantity;
    cashRegisterTotal += getItemCount() * getItemPrice();
  }

  /**
   * Method changes the total cash WRT the change to item count
   * @param quantity: number of item removed
   */
  public void removeItem(int quantity) {
    itemCount -= quantity;
    cashRegisterTotal -= getItemCount() * getItemPrice(); 
  }

  /**
   * Method sets the price of the item
   * @param itemPrice: price of the item
   */
  public void setItemPrice(double itemPrice) {
    this.itemPrice = itemPrice;
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
  public int getOneHundreds() {
    return numOf100s;
  }

  /**
   * Method gets the number of 50-dollar bills
   * @return number of fiftys
   */
  public int getFiftys() {
    return numOf50s;
  }

  /**
   * Method gets the number of 20-dollar bills
   * @return number of twentys
   */
  public int getTwentys() {
    return numOf20s;
  }

  /**
   * Method gets the number of 10-dollar bills
   * @return number of tens
   */
  public int getTens() {
    return numOf10s;
  }  

  /** Method gets the number of 5-dollar bills
   * @return number of fives
   */
  public int getFives() {
    return numOf5s;
  }

  /**
   * Method gets the number of 1-dollar bills
   * @return number of ones
   */
  public int getOnes() {
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
   * Method gets the total amount of coin in one register
   * @return total coin
   */
  public double getCoinTotal() {
    return coinTotal;
  }

  /**
   * Method gets the total cash amount in one register
   * @return total cash
   */
  public double getCashInBills() {
    return cashInBills;
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