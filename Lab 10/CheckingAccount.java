
public class CheckingAccount extends BankAccount {

	
	//class variables
	final private static double FEE = 0.15;
		
	//super class constructor
	public CheckingAccount(String name, double amount) {
		
		//calls super class constructor
		super(name, amount);
		
		setAccountNumber(getAccountNumber()+"-10");
		
	}
	
	public boolean withdraw(double amount) {
	
		amount = amount + FEE;
		
		return super.withdraw(amount);
		
	}
	
		
	
	
	
}
