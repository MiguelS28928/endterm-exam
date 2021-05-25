package Endtermexam;

import javax.swing.JOptionPane;

public class AccountUnitTest {
	public static void main(String[]args) {
		Checking accountcheck = new Checking(1,100000);
		Savings accountsave = new Savings(1,100000, 1.6);
		
		JOptionPane.showMessageDialog(null, accountcheck.getInformation());
		JOptionPane.showMessageDialog(null, accountsave.getInformation());
		
		Account[] Array = new Account[10];
		
		Array[0]= new Checking(1,100000.00) ;
		Array[1]= new Checking(1,100000.00) ;
		Array[2]= new Checking(1,100000.00) ;
		Array[3]= new Checking(1,100000.00) ;
		Array[4]= new Checking(1,100000.00) ;
		Array[5]= new Savings (1,100000.00,0.9) ;
		Array[6]= new Savings (1,100000.00,0.72) ;
		Array[7]= new Savings (1,100000.00,0.55) ;
		Array[8]= new Savings (1,100000.00,1.26) ;
		Array[9]= new Savings (1,100000.00,0.78) ;
		
		for(int i=0;i < Array.length; ++i) {
		
			System.out.println(Array[i].getInformation() + "\n");
		}
	}


}
