package src.bank;

import java.util.Scanner;

public class Bank { 
	
	//Declaring bank class variables
	static double money; 
	String deposit;
	String withdrawal;
	//Scanner class
	Scanner sc = new Scanner(System.in); 
	
	//Initializing bank method and money variable
	Bank () {
		money = 1000000;
	}

	//Bank method with one parameter
	Bank(double bMoney) {
		money = bMoney;
	}
	
	//Method to check amount in bank
	void checkBank() {
		System.out.printf("You currently have $%.2f in your bank.\n", money);
	}

	//Method before changing bank variable (deposit into bank)
	void beforeBankDeposit() {
		System.out.printf("You currently have $%.2f amount in your bank.\nPlease enter "
				+ "the amount you would like to deposit into the bank: ", money);	
	}
	
	//Method after changing bank variable (deposit into bank)
	void afterBankDeposit(double bDeposit) {
		money += bDeposit;
		System.out.printf("You have deposited $%.2f and now have $%.2f in your bank account.\n"
				,  bDeposit, money);
	}
	
	//Method before changing bank variable (withdrawal from bank)
	void beforeBankWithdrawal() {
		System.out.printf("You currently have $%.2f amount in your bank.\nPlease enter "
				+ "the amount you would like to withdrawal out of the bank: ", money);
	}
	
	//Method after changing bank variable (withdrawal from bank)
	void afterBankWithdrawal(double bWithdrawal) {
		money -= bWithdrawal;
		System.out.printf("You have withdrawn $%.2f and now have $%.2f in your bank account\n"
				,  bWithdrawal, money);
	}
}
