package BankAccount;
import java.util.*;
import java.math.*;
public abstract class Account implements iBaseRate{
	//List common properties for savings and checking accounts
	private String name;
	private String SSN;
	private double balance;
	protected String accountNum;
	protected double rate;
	protected static int index = 10000;
	
	
	//Constructor to set base properties and initialize the account
	public Account() {
	
	}
	
	public Account(String name, String SSN, double initDeposit) {
		this.name = name;
		this.SSN = SSN;
		this.balance = initDeposit;
				
		//set account number
		index++;
		this.accountNum = setAccountNumber();
		setRate();
	}
	
	protected abstract void setRate();
	
	private String setAccountNumber() {
		String lastTwoOfSSN = SSN.substring(SSN.length() - 2, SSN.length());
		int uniqueID = index;
		Random randNumber = new Random();
		int x = randNumber.nextInt(900) + 100;
		return lastTwoOfSSN + uniqueID + x;
	}
	
	//List common methods
	
	protected void compound() {
		double accruedInterest = balance * (rate/100);
		System.out.println("Accrued Interest: $" +accruedInterest);
		balance = balance + accruedInterest;
		printBalance();
	}
	
	protected void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Depositing $"+amount);
		printBalance();
	}
	
	protected void withdraw(double amount) {
		if(balance < amount) {
			System.out.println("Insufficient funds, you cannot perform this transaction");
		}else {
		balance = balance - amount;
		System.out.println("Withdrawing $"+amount);
		printBalance();
		}
	}
	
	protected void transfer(String toWhere, double amount) {
		if(balance < amount) {
			System.out.println("Insufficient funds, you cannot perform this transaction");
		}else {
			balance = balance - amount;
			System.out.println("Transfering $" +amount + " to " +toWhere);
			printBalance();
		}
		
	}
	
	protected void printBalance() {
		if(balance < 0) {
			System.out.println("Your account has a negative balance of: "+balance);
		}else
		System.out.println("Your current balance is: " +balance);
		
	}
	
	protected void showInfo() {
		System.out.println("Name: " +name + "\nAccount Number: "+accountNum +"\nBalance: "+balance
				+ "\nRate: "+rate + "%");
		
	}
	
	/**This method assist Checkings being able to produce a unique 12 Digit Debit Card Number. 
	Since Java can't print random 12 digit number with the Random class. I had to manipulate the data using an algorithm
	to be able print the 12 digit card number.
	Generate each digit by calling random.nextInt. For uniqueness, I could've kept track of the random numbers I have used 
	so far by keeping them in a HashSet and checking if the set contains the number generated each time.
	*/
	protected static long generateRandom(int length) {
	    Random random = new Random();
	    char[] digits = new char[length];
	    digits[0] = (char) (random.nextInt(9) + '1');
	    for (int i = 1; i < length; i++) {
	        digits[i] = (char) (random.nextInt(10) + '0');
	    }
	    return Long.parseLong(new String(digits));
	}
	
}
