package Endtermexam;

public class Savings extends Account implements depositable{

	private double rate;
	
	public Savings(int accountNumber, double accountbalance, double interest){
		super(accountNumber);	
		getAccountNumber();
		getAccountBalance();
		setInterest(interest);
	}
	
	public void deposit (double count) {
		this.accountbalance += count;
	}
	
	public void setInterest(double interest){
		rate=interest;
	}
	
	public double setInterest() {
		return rate;
	}
	
	public int getAccountNumber(){
		
		return accountnumber;
	}
	
	public double getAccountBalance(){
		return accountbalance;
	}
	
	public String getInformation() {
		return("Savings Account Information"+"\n Account Number: " + getAccountNumber() +"\n Balance: " + getAccountBalance() +"\n Interest: "+setInterest() );
	
	}

}
