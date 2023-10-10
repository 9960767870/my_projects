package Wrapper_Classes_In_Number_Class;
 
// Java program to demonstrate valueOf() method

public class ValueOf_Method_Example {
	 public static void main(String[] args)
	    {
	        // demonstrating valueOf(int i) method
	        System.out.println("Demonstrating valueOf(int i) method");
	        Integer i =Integer.valueOf(50);
	        Double d = Double.valueOf(9.36);
	        System.out.println(i);
	        System.out.println(d);
	             
	        // demonstrating valueOf(String s) method
	        System.out.println("Demonstrating valueOf(String s) method");
	        Integer n = Integer.valueOf("333");
	        Integer m = Integer.valueOf("-255");
	        System.out.println(n);
	        System.out.println(m);
	             
	        // demonstrating valueOf(String s,int radix) method
	        System.out.println("Demonstrating (String s,int radix) method");
	        Integer y = Integer.valueOf("333",8);
	        Integer x = Integer.valueOf("-255",16);
	        Long l = Long.valueOf("51688245",16);
	        System.out.println(y);
	        System.out.println(x);
	        System.out.println(l);
	             
	        // run-time NumberFormatException will occur in below cases
	        Integer a = Integer.valueOf("Geeks");
	        Integer b = Integer.valueOf("Geeks",16);
	    }

}
