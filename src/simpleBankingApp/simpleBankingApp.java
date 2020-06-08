package simpleBankingApp;

import java.util.Scanner;

public class simpleBankingApp {

	long initialDeposit = 0;
	long amountToWithdraw;
	long balance;
	Scanner scanner = new Scanner(System.in);
	String[] accountType = {"current", "savings"};
	
	public simpleBankingApp() {
		System.out.println("==============================");
		System.out.println("-----Welcome to XAE bank!-----");
		System.out.println("==============================");
		
	}
	public void selectAccountType() {
		System.out.println("Select 1 for Current Account\nSelect 2 for Savings Account");
		String accountType = scanner.next().toLowerCase();
		switch (accountType) {
			case "current":
				break;
			case "savings":
				break;
			default:
				break;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new simpleBankingApp();
		new transactions();
	}
	
	public long getInitialDeposit() {
		return initialDeposit;
	}

	public void setInitialDeposit(long initialDeposit) {
		this.initialDeposit += initialDeposit;
	}

	public long getAmountToWithdraw() {
		return amountToWithdraw;
	}

	public void setAmountToWithdraw(long amountToWithdraw) {
		this.amountToWithdraw = amountToWithdraw;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long amount, long amountToWithdraw) {
		this.balance = amount - amountToWithdraw;
	}


}
