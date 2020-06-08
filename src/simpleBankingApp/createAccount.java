package simpleBankingApp;

import java.util.ArrayList;

public class createAccount extends simpleBankingApp {

	String name;
	String Address;
	ArrayList<Integer> phoneNumber = new ArrayList<Integer>();
	int noOfPhoneNumbers = 0;
	public createAccount() {
		System.out.println("Thank you for choosing XAE bank!");
		//enter full name
		System.out.print("Please enter full name here: ");
		setName(scanner.next());
		
		System.out.println("Thank you, almost done now.");
		//enter phone number
		System.out.print("We would like to contact you about promos :)\nPlease enter your phone numbers here: ");
		setPhoneNumber(scanner.nextInt());
		
		//enter address
		System.out.println("Last thing, we promise.\nPlease enter your address: ");
		setAddress(scanner.next() + scanner.nextLine());
		System.out.println("Thank you for banking with us " + name);
		System.out.println(getPhoneNumber(noOfPhoneNumbers));
		System.out.println(Address);
	}

	public static void main(String[] args) {
		new createAccount();
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public Integer getPhoneNumber(int noOfPhoneNumbers ) {
		return phoneNumber.get(noOfPhoneNumbers);
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber.add(phoneNumber);
	}
}
