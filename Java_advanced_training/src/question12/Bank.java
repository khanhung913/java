package question12;

public class Bank {
	private int balance;
	static int totalBalance = 0;

	public Bank(int initialBalance) {
		this.balance = initialBalance;
		totalBalance += initialBalance;
	}

	public void deposit(int amount) {
		this.balance += amount;
		totalBalance += amount;
	}

	public int getBalance() {
		return this.balance;
	}

	public int getTotalBalance() {
		return totalBalance;
	}
}
