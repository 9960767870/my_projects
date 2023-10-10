package Second;

import java.util.Scanner;

public class AccountManagement {
	
	String AccountHoldername;
	int balence=0;

	public void insertdata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the account name");
		 AccountHoldername = sc.next();
		 
		System.out.println("Congrats");
		
	}
	
	public void display() {
		
		System.out.println(AccountHoldername);
		System.out.println(balence);
	}
	
	public void depositeAmount(int Amount) {
		balence = balence+Amount;
		
	}
	
	public void withdrawAmount(int Amount) {
		
		balence = balence-Amount;
	}
	
	public static void main(String[] args) {
		
		AccountManagement a = new AccountManagement();
		a.insertdata();
		
		
		a.depositeAmount(12000);
	    a.display();
		a.withdrawAmount(2000);
		a.display();
	}
}
