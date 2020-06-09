import java.text.NumberFormat;
import java.util.Scanner;

public class user {
	

	private long initialDeposit = 0;
	private long amountToWithdraw;
	private long balance;
	public Scanner scanner = new Scanner(System.in);

	public user() {
		String decision;
		do {
			System.out.println("What would you like to do today?\n\n");
			System.out.println("\t Select 1 to deposit money.");
			System.out.println("\t Select 2 to withdraw some money.");
			System.out.println("\t Select 3 to view account balance.");
			byte choice;
			choice = scanner.nextByte();
			
			switch(choice) {
			case 1:
				System.out.println("How much do you want to deposit? ");
				setInitialDeposit(scanner.nextLong());
				System.out.println("You have deposited the sum of " + NumberFormat.getCurrencyInstance().format(initialDeposit));
				break;
			case 2:
				System.out.println("How much do you want to withdraw?");
				setAmountToWithdraw(scanner.nextLong());
				System.out.println("The sum of " + NumberFormat.getCurrencyInstance().format(amountToWithdraw) + " has been withdrawn from your account.");
				break;
			case 3:
				setBalance(initialDeposit, amountToWithdraw);
				System.out.println("Your account balance is " + NumberFormat.getCurrencyInstance().format(getBalance()));
				break;
				
			default:
				System.out.println("The option selected does not exist");
				break;
			}
			
			System.out.println("\n\nWould you like to carry out another transaction?");
			System.out.println("Yes/No ?");
			decision = scanner.nextLine() + scanner.nextLine().toLowerCase();
			
		}while(decision.equals("yes"));

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
