import java.text.NumberFormat;
import java.util.Scanner;

public class user {
	
	private String name;
	private long userID;
	private long deposit = 0;
	private long amountToWithdraw;
	private long balance;
	public Scanner scanner = new Scanner(System.in);

	public user() {
		String decision;
		
		System.out.print("Please enter your name: ");
		setName(scanner.nextLine());
		System.out.println("\nHi " + name + ",");
		System.out.println("What would you like to do today?");
		do {
			//Enter name to create account
			//generate userID for customer
			//select account to perform transaction on 
			System.out.println("\t ___________________________________");
			System.out.println("\t|                                   |");
			System.out.println("\t| Select 1 to deposit money.        |");
			System.out.println("\t| Select 2 to withdraw money. 	  |");
			System.out.println("\t| Select 3 to view account balance. |");
			System.out.println("\t|___________________________________|");
			byte choice;
			System.out.print("\nEnter =>");
			choice = scanner.nextByte();
			
			switch(choice) {
			case 1:
				System.out.println("How much do you want to deposit? ");
				setInitialDeposit(scanner.nextLong());
				System.out.println("You have deposited the sum of " + NumberFormat.getCurrencyInstance().format(deposit));
				break;
			case 2:
				System.out.println("How much do you want to withdraw?");
				setAmountToWithdraw(scanner.nextLong());
				System.out.println("The sum of " + NumberFormat.getCurrencyInstance().format(amountToWithdraw) + " has been withdrawn from your account.");
				break;
			case 3:
				setBalance(deposit, amountToWithdraw);
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getUserID() {
		return userID;
	}
	public void setUserID() {
		long minNumber = 1;
		long maxNumber = 1000000;
		this.userID = minNumber +  Math.round(Math.random() * maxNumber);
	}
	
	public long getInitialDeposit() {
		return deposit;
	}

	public void setInitialDeposit(long initialDeposit) {
		this.deposit += initialDeposit;
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
