package filehandling;

import java.io.Serializable;

public class Account implements Serializable {
	private int accountNumber;
	private int balance;
	transient private int atmPin;
	
	public Account(int accountNumber, int balance, int atmPin) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.atmPin = atmPin;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getAtmPin() {
		return atmPin;
	}

	public void setAtmPin(int atmPin) {
		this.atmPin = atmPin;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", balance=" + balance + ", atmPin=" + atmPin + "]";
	}
	
}
