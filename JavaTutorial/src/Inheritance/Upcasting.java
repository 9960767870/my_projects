package Inheritance;

class K{
	
	public void Rushikesh() {
		System.out.println("I am Good Boy");
	}
	
	
}

class L extends K{
	
	public void Sachin() {
		System.out.println("Hi Sachin");
	}
}

public class Upcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 K a = new L();
	 a.Rushikesh();
		

	}

}
