package com.Faublas.bankaccount;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount();
		
		
		System.out.println("Account Holders' Checking Account information");
		System.out.println(account1.getCheckingBalance());
		System.out.println(account2.getCheckingBalance());
		System.out.println();
		
		System.out.println("Account Holders' Savings Account information");
		System.out.println(account1.getSavingsBalance());
		System.out.println(account2.getSavingsBalance());
		System.out.println();
		
		System.out.println("Here is your deposit information for Account One");
		account1.deposit("checking", 1628);
		account1.deposit("savings", 675);
		System.out.println();
		
		System.out.println("Here is your deposit information for Account Two");
		account2.deposit("checking", 3967);
		account2.deposit("savings", 165);
		System.out.println();
		
		System.out.println("Account One Checking Account Balance");
		System.out.println(account1.getCheckingBalance());
				
		System.out.println();
		System.out.println("Account Two Checking Account Balance");
		System.out.println(account2.getCheckingBalance());
		
		System.out.println();
		System.out.println("Account One Savings Account Balance");
		System.out.println(account1.getCheckingBalance());
		
		System.out.println();
		System.out.println("Account Two Savings Account Balance");
		System.out.println(account2.getCheckingBalance());
		
		
		System.out.println();
		System.out.println("Account One makes a withdrawal from checking account");
		account1.withdraw("checking", 128);
		System.out.println(account1.getSavingsBalance());
		

	}

}
