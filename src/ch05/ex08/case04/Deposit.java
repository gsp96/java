package ch05.ex08.case04;

public class Deposit {
	private int balance;
	
	public Deposit() {
		this(1_000);
	}
	
	public Deposit(int principal) {
		this.balance = principal;
	}
	
	public Deposit(int principal, int interest) {
		this.balance = principal + interest;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
