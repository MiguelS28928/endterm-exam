package Endtermexam;

public class Checking extends Account implements depositable{
	
	
	
	
	public Checking(int accountnumber, double accountbalance){
		super(accountnumber); 
		getAccountNumber();
		getAccountBalance();
	}
	
	public void deposit (double count) {
		
		this.accountbalance += count;
	}
	
	public int getAccountNumber(){
	
		return accountnumber;
	}
	
	public double getAccountBalance(){
		return accountbalance;
	}
	
	public String getInformation() {
		return(" Checking Account Information" +"\n Account Number: " + getAccountNumber()+"\n Balance: " + getAccountBalance());
	}

}
