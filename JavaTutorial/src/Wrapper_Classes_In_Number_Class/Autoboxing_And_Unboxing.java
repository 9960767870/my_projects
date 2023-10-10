package Wrapper_Classes_In_Number_Class;

public class Autoboxing_And_Unboxing {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		// creating an Integer Object
        // with value 10.
		Integer i = new Integer(10);
		
		 // unboxing the Object
		int i1  = i;
		
		System.out.println("Value of i " + i);
		System.out.println("Value of i1 " + i1);
		
		//Autoboxing of char
		Character gc = 'a';
		
		// Auto-unboxing of Character
		char ch = gc;
		System.out.println("Value of ch " + ch);
		System.out.println("Value of gc " + gc);

	}

}
