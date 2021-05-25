package Endtermexam;

public abstract class Account {
	
	int accountnumber;						
	double accountbalance;
	
	public Account(int balance){
	accountbalance = balance;				
	setBalance(0.0);
	}
	
	public void setBalance(double x) {
		accountbalance = x;
	}
	
	public abstract int getAccountNumber();
	public abstract double getAccountBalance();
	public abstract String getInformation();

}
