package src.bank;

import java.util.*;

//Main Class
public class DiceGame {

	static Scanner sc = new Scanner(System.in);
	
	//Calling all the classes
	static Bank b = new Bank();
	static Wallet w = new Wallet();
	static DiceProcess d = new DiceProcess();
	
	//Main menu
	static int showMenuInfo(Scanner sc) {
		
		System.out.println("------------------------");
		System.out.println("Please select a menu: ");
		System.out.println("1. Check Bank Balance");
		System.out.println("2. Check Wallet Balance");
		System.out.println("3. Deposit money from bank to wallet");
		System.out.println("4. Deposit money from wallet to bank");
		System.out.println("5. Start Game");
		System.out.println("6. End Program");
		System.out.print("Menu #: ");
		
		//Menu options are inputted through integers
		int menuOption = 0;
		
		//try/catch methods
		//if input is not an integer, throws an error and asks to re-input an integer
		try {
			menuOption = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Please enter a number #1 to #6.");
				System.out.println("> ");
				sc.nextLine();
			} 
		return menuOption;	
	}
	
	//Main argument
	public static void main(String[] args) {
		
		//Continuous conditional
		while (true) {
			
			int menuOption = showMenuInfo(sc);
			if (menuOption == 1) {
				b.checkBank();
			} else if (menuOption == 2) {
				w.checkWallet();
			} else if (menuOption == 3) {
				b.beforeBankWithdrawal();
				double bWithdrawal = sc.nextDouble();
	
				//Checks to see if there is enough money in the bank class
				if(bWithdrawal > Bank.money) {
					System.out.println("There is not enough balance!");
					continue;
				}	
				
				b.afterBankWithdrawal(bWithdrawal);
				w.walletDeposit(bWithdrawal);
				w.walletDepositMessage();
			} else if (menuOption == 4) {
				w.walletWithdrawalMessage();
				double bDeposit = sc.nextDouble();
				b.afterBankDeposit(bDeposit);
				w.walletWithdrawal(bDeposit);
				w.walletWithdrawalMessage();
			} else if (menuOption == 5) {
				
				//Starts the DiceProcess class
					d.betStart();
					d.rollDie();
								
			} else if (menuOption == 6) {
				System.out.println("Program will end.\nThank you for Playing! ^^");
				break;
			} else {
				//Since conditional is 'while(true), will show the menu template again
				System.out.println("Please try again.");
			}
			
		}
	}
	
}
