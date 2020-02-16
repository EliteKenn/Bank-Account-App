package BankAccount;
import java.io.*;
import java.util.*;
public class BankApp {

	public static void main(String[] args) {
		
		List<Account> accounts = new LinkedList<>();
		
		//Read a CSV File then create new accounts based on that data
		String file = "C:\\Users\\User\\UdemyProjects\\NewBankAccounts.csv";
		List<String[]> newClients = Utilities.CSV.read(file);
		for(String[] x : newClients) {
			String name = x[0];
			String SSN = x[1];
			String accountType = x[2];
			double initDeposit = Double.parseDouble(x[3]);
			
			if(accountType.equals("Savings") ) {
				
				accounts.add(new Savings(name, SSN, initDeposit));
			}
			else if
				(accountType.equals("Checking")) {
					
					accounts.add(new Checking(name, SSN, initDeposit));
					}
			else {
				System.out.println("Error reading account type: ");
			}
			
		}
		
		for(Account acc : accounts) {
			acc.showInfo();
		}
		
	}
}
