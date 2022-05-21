package com.abin.ATM;

import java.util.Scanner;

public class SimpleATM {

	public static void main(String[] args) {

		int balance = 20000;
		int withdraw;
		int deposit;
		int num;

		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("Welcome to ATM");
			System.out.println("Choose the correct number against the service");
			System.out.println("1. Withdraw");
			System.out.println("2. Deposite");
			System.out.println("3. Balance Enquiry");
			System.out.println("4. EXIT");

			num = scn.nextInt();

			switch (num) {
			case 1:
				System.out.println("Enter the amount to be withdrawn");
				withdraw = scn.nextInt();
				if (balance >= withdraw) {
					balance = balance - withdraw;
					System.out.println("Balance Amount : " + balance);
					System.out.println("Collect your money");
				} else {
					System.out.println("Insufficient Balance");
				}
				System.out.println(" ");
				break;

			case 2:
				System.out.println("Enter the amount to deposit");
				deposit = scn.nextInt();
				balance = balance + deposit;
				System.out.println("Balance Amount : " + balance);
				System.out.println("Amount credited to your account succesfully");
				System.out.println(" ");
				break;

			case 3:
				System.out.println("Balance Amount : " + balance);
				break;

			case 4:
				System.exit(0);
				System.out.println(" ");
			}
		}

	}

}
