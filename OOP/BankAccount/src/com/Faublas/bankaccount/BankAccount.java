package com.Faublas.bankaccount;

public class BankAccount {

	public double checkingBalance;

	public double savingsBalance;

	public static int numberOfAccountsCreated = 0;

	public double totalBalance;

	// empty constructor
	public BankAccount() {

		numberOfAccountsCreated += 1;

	}

	// loaded constructor
	public BankAccount(double checkingBalance, double savingsBalance) {
		this.checkingBalance = checkingBalance;
		this.savingsBalance = savingsBalance;
		numberOfAccountsCreated += 1;
	}

	// GETTERS AND SETTERS
	public double getCheckingBalance() {
		return checkingBalance;
	}

	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	public double getTotalBalance() {
		return totalBalance;
	}

	public void setTotalBalance(double totalBalance) {
		this.totalBalance = totalBalance;
	}

//	 Method to deposit $$ into account
	public void deposit(String account, double amount) {
		if (account == "checking") {
			this.checkingBalance += amount;
			totalBalance += amount;
			System.out.println("Checking Account now funded with recent deposit");
		} 
		else if (account == "savings") {
			this.savingsBalance += amount;
			totalBalance += amount;
			System.out.println("Savings Account now funded with recent deposit");
		} 
		else {System.out.println("Insufficient Funds");}
	}


	// Method to withdraw $$ from account
	public void withdraw(String account, double amount) { 
		if (account == "checking") {
			if(this.checkingBalance>=amount) {
				this.checkingBalance -= amount;
				System.out.printf("Successful withdrawal.Remaining checking balance: $%s", this.checkingBalance);
				totalBalance -= amount;
			}
			else {System.out.println("Insufficient Funds");}
		}
		else if (account == "savings") {
				if(this.savingsBalance>=amount) {
					this.savingsBalance -= amount;
					System.out.printf("Successful withdrawal.Remaining savings balance: $%s", this.savingsBalance);
				totalBalance -= amount;
			}
			else {System.out.println("Insufficient Funds");}
		}	
	}		
}
