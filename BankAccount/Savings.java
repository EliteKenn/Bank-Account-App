package BankAccount;
import java.util.Random;
public class Savings extends Account {

	//List properties specific to the Savings account
	private int safetyDepoBoxID;
	private int safeDepoBoxKey;
	
	//Default constructor
	public Savings() {
		
	}
	//Constructor to initialize settings for savings properties
	public Savings(String name, String sSN, double initDeposit) {
		super(name,sSN, initDeposit);
		accountNum = "1" + accountNum;
		setSafetyDepoBox();
		
	}
	
	//List any methods specific to savings account
	@Override
	protected void setRate() {
		rate = getBaseRate() - .25;
	}
	
	private void setSafetyDepoBox() {
		Random random = new Random();
		this.safetyDepoBoxID = random.nextInt(999 + 1 - 100)+100;
		this.safeDepoBoxKey = random.nextInt(9999 + 1 - 1000)+1000;
		
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println(" Your Savings Account Features: "
				+ "\n Safety Deposit Box ID: " +safetyDepoBoxID + 
				"\n Safety Deposit Box Key: " +safeDepoBoxKey + "\n");
		System.out.println("************************");
	}
	
	
	
	
}
