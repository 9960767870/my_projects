package Constructor;

public class Bank {
	
	int amount = 5000;
	int add ;
	
	public Bank() {
		System.out.println("No Amount Added");
	}
	
	

	public Bank( int add) {
		
		
		this.add = add;

	}
	public void display() {
		int totalamount = amount+add;
		System.out.println(totalamount);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank b = new Bank();
		
		Bank b1 = new Bank(4000);
		b1.display();
		
		
	}

}
