package Test2;


interface Votingapp{
	 
	 public void registerUser();
	 public void requestVotingNumber();
 }
 
 class kid implements Votingapp{
 
	 int age = 13; 
	
	public void registerUser() {
		 if(age<12) {
			 System.out.println("You have successfullyregistered under Kids");
		 }
		 else {
			 
			 System.out.println("You have not successfully registered");
		 }
			
	}

	public void requestVotingNumber() {
		 if(age<12) {
			 System.out.println("You have successfullyregistered requestVotingNumber Kids");
		 }
		 else {
			 
			 System.out.println(" Sorry you are not join");
		 }
		 
	}
	 
	
 }
 
 
 class Adult implements Votingapp{
  int age = 10; 
	@Override
	public void registerUser() {
		if(age>12) {
			System.out.println(" You have successfully registered under an Adult ");
			
		}
		else {
			System.out.println("You have not successfully registered under an Adult");
		}
		
	}

	@Override
	public void requestVotingNumber() {
		if(age>12) {
			System.out.println("You have successfully registered requestVotingNumber an Adult ");
			
		}
		else {
			System.out.println("oops you are not join");
		}
		
	}
	 
 }

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		kid k = new kid();
		k.registerUser();
		k.requestVotingNumber();
		System.out.println();
		Adult a = new Adult();
		a.registerUser();
		a.requestVotingNumber();
		
	}

}
