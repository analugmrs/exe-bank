package entities;

public class Account {

	private int account;
	private String name;
	private double balance;
	
	public Account(int account, String name) {
		this.account = account;
		this.name = name;
	}
	
	public Account(int account, String name, double initialDeposit) {
		this.account = account;
		this.name = name;
		deposit(initialDeposit);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void getAccount(int account) {
		this.account = account;
	}
	
	public void deposit (double value) {
		balance += value;
	}
	
	public void withdraw (double value) {
		balance -= (value + 5);
	}
	
	public String toString() {
		return "Account "
			+ account
			+ ", Holder: "
			+ name
			+ ", Balance: "
			+ balance;
	}
	
	
}
