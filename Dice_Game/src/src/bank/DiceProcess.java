package src.bank;

import java.util.Random;
import java.util.Scanner;

public class DiceProcess {

	Scanner sc = new Scanner(System.in);
	Random rn = new Random();
	Wallet w = new Wallet();
	static double bet;
	
	//betStart class, asks for the bet amount
	public void betStart() {
		System.out.println("A dice will be thrown.\nIf the value is an even number, "
				+ "your money is doubled. " + 
				"If it is an odd number, you will lose your bet.");
		System.out.println("Please enter the amount you would like to bet: ");
		bet = sc.nextDouble();
		System.out.printf("You have bet: $%.2f\n", bet);
	}

	//Starts the rollDie class using a random number generator
	//If die == even, double money; if odd, lose bet
	public void rollDie() {
		int faceValue = rn.nextInt(6) + 1;
		if(faceValue % 2 == 0) {			
			System.out.println("Dice Roll: " + faceValue);
			System.out.println("The roll is even and you have doubled your money!");
			w.walletWin(bet);
		} else if (faceValue % 2 == 1) {
			System.out.println("Dice Roll: " + faceValue);
			System.out.println("The roll is odd and you have lost your bet. :<");
			w.walletLose(bet);		
		}
	}

}
