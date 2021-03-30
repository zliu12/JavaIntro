/**
 * Class - UsingCashRegister
 *
 * Copyright (c) [2021], Zhao Liu.
 */

public class UsingCashRegister {
	public static void main(String[] args) {
		// Initialize two CashRegister objects with different constructors
		CashRegister r1 = new CashRegister(222.00, 11.25);
		CashRegister r2 = new CashRegister(1, 2, 3, 4, 5, 6, 5.85);
		
		System.out.println("Register1 now has $" + r1.getCashRegisterTotal() + " dollars in total.");
		r1.setItemCount(15);
		System.out.println("Register1 has " + r1.getItemCount() + " items.");
		r1.setItemPrice(2.25);
		System.out.println("The price is $" + r1.getItemPrice() + " per item.");
		r1.addItem(10);
		System.out.println("Add more items, register1 now has " + r1.getItemCount() + " items.");
		r1.removeItem(5);
		System.out.println("Remove items, register1 now has " + r1.getItemCount() + " items.");
		System.out.println("Register1 now has $" + r1.getCashRegisterTotal() + " dollars in total.");
		System.out.println();

		System.out.println("Register2 now has $" + r2.getCashRegisterTotal() + " dollars in total.");
		r2.getOneHundreds();
		System.out.println("Register2 has " + r2.getOneHundreds() + " 100 bills.");
		r2.getFiftys();
		System.out.println("Register2 has " + r2.getFiftys() + " 50 bills.");
		r2.getTwentys();
		System.out.println("Register2 has " + r2.getTwentys() + " 20 bills.");
		r2.getTens();
		System.out.println("Register2 has " + r2.getTens() + " 10 bills.");
		r2.getFives();
		System.out.println("Register2 has " + r2.getFives() + " 5 bills.");
		r2.getOnes();
		System.out.println("Register2 has " + r2.getOnes() + " 1 bills.");
		r2.getCashRegisterTotal();
		System.out.println("Register2 now has " + r2.getCashInBills() + " in cash and " + 
												r2.getCoinTotal() + " in coins.");

		System.out.println("Register1 and register2 has " +
												CashRegister.getAllCashRegisterTotals() +
												" dollars in total.");

		r1.clear();;
		System.out.println("Register1 has been cleared.");
		System.out.println("Register1 now has " + r1.getCashRegisterTotal() + " dollars.");

		CashRegister.clearAll();
		System.out.println("Both registers have been cleared.");
		System.out.println("Register1 and register2 now has " +
												CashRegister.getAllCashRegisterTotals() +
												" dollars in total.");
	}
}
