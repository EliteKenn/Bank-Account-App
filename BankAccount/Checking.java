package BankAccount;
import java.util.*;
public class Checking extends Account {

	//List properties(attributes) specific to Checkings Account
	
	private long debitCardNumber;
	private long debitCardPin;
	
	//Constructor to initialize checking account properties
	public Checking() {
			
	}
	
	public Checking(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNum = "2" + accountNum;
		setDebitCard();

	}

	//List any methods specific to checking account
	@Override
	protected void setRate() {
		rate = getBaseRate() * .15;
	}
	
	private void setDebitCard() {
		Random random = new Random();
		
		debitCardNumber = Account.generateRandom(12);
		debitCardPin = (int) (1+Math.random() * 9999);
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println(" Your Checking Account Features: "
				+ "\n Debit Card Number: " +debitCardNumber + 
				"\n Debit Card PIN: " +debitCardPin +"\n");
		System.out.println("************************");
	}
	
}
