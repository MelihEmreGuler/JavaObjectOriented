package ch12.account;

public class Account {
	private double balance = 0;
	private String name;
	private int accountNumber = 0;
	
	
	Account(String name, int accountNumber) {
	this.name = name;
	this.accountNumber = accountNumber;
	}
	
	double getBalance() {
		return balance;
	}
	void setBalance(double balance) {
		this.balance = balance;
	}
	
	String getName() {
		return name;
	}
	
	int getAccountNumber() {
		return accountNumber;
	}
}
