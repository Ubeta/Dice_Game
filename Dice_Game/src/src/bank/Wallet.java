package src.bank;

import java.util.Scanner;

public class Wallet { 
	
	static double money;
	
	Scanner sc = new Scanner(System.in);
	
	Wallet () {
		money = 0;
	}
	
	Wallet(double wMoney) {
		money = wMoney;
	}
	
	//Doubles money in wallet after winning die game
	void walletWin(double bet) {
		money = money + (bet * 2);
	}
	
	//Subtracts bet from wallet after losing bet
	void walletLose(double bet) {
		money = money - bet;
	}
	
	//Checks amount in wallet
	void checkWallet() {
		System.out.printf("You currently have $%.2f in your wallet.\n", money);
	}
	
	void walletDeposit(double wDeposit) {
		money += wDeposit;
	}
	
	void walletWithdrawal(double wWithdrawal) {
		money -= wWithdrawal;
	}
	
	void walletDepositMessage() {
		System.out.printf("You currently have $%.2f in your wallet\n", money);
	}
	
	void walletWithdrawalMessage() {
		System.out.printf("You currently have $%.2f in your wallet\n", money);
	}

}
