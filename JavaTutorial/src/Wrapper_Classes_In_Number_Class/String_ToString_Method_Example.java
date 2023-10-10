package Wrapper_Classes_In_Number_Class;

//Java program to demonstrate Integer.toString()
//and Integer.toString(int i) method

public class String_ToString_Method_Example {

	public static void main(String[] args) {

        // demonstrating toString() method
		Integer x = 12;
		
		System.out.println(x.toString());
		
		 // demonstrating toString(int i) method
		System.out.println(Integer.toString(12));
		
		System.out.println(Integer.toBinaryString(152));
		System.out.println(Integer.toHexString(152));
		System.out.println(Integer.toOctalString(152));

	}

}
