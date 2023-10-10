package Wrapper_Classes_In_Number_Class;

//Java program to demonstrate Integer.parseInt() method

public class ParseInt_Method_Example {
	
	public static void main(String[] args) {
		// parsing different strings
        int z = Integer.parseInt("654",8);
        int a = Integer.parseInt("-FF", 16);
        long l = Long.parseLong("2158611234",10);
             
        System.out.println(z);
        System.out.println(a);
        System.out.println(l);
             
        // run-time NumberFormatException will occur here
        // "Geeks" is not a parsable string
        int x = Integer.parseInt("Geeks",8);
             
        // run-time NumberFormatException will occur here
        // (for octal(8),allowed digits are [0-7])
        int y = Integer.parseInt("99",8);
             
    }
	}

/*int parseInt(String s,int radix) : 
  This method is used to get the primitive data type of a String. 
  Radix is used to return decimal(10), octal(8), or hexadecimal(16) etc representation as output. 
		 
Syntax : 
static int parseInt(String s, int radix)
Parameters : 
s - any String representation of decimal
radix - any radix value
Returns :
the integer value represented by the argument in decimal.
Throws :
NumberFormatException : if the string does not contain a parsable integer.
*/