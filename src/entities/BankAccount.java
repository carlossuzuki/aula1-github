package entities;


public class BankAccount {

	private int number;
	private String holder;
	private double balance;

	public BankAccount() {

	}
	public BankAccount(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
		
	}
	public BankAccount(int number, String holder) {
		this.number = number;
		this.holder = holder;
		this.balance = 0.00;

	}

	public int getNumber() {
		return number;
	}
	public String getholder() {
		return holder;
	}

	public void setholder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double depValue) {
		this.balance += depValue;
	}

	public void withdraw(double witValue) {
		this.balance -= (witValue + 5.0);
	}

	public String toString() {
		return 
				"Account " + 
				this.number + 
				", Holder: " + 
				this.holder + 
				", Balance: $ " + 
				this.balance;
	}

}
