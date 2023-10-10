package Wrapper_Classes_In_Number_Class;

//Java program to demonstrate xxxValue() method

  public class Value_Method {
	  
	  public static void main(String[] args) {
		  
		  
		// Creating a Double Class object with value "6.9685"
		  Double d = new Double("6.9685");
		  
		  
		// Converting this Double(Number) object to
	        // different primitive data types
		  int i = d.intValue();
		  byte b = d.byteValue();
		  short s = d.shortValue();
		  long l = d.longValue();
		  float f = d.floatValue();
		  double m = d.doubleValue();
		  
		  System.out.println("value of d after converting it to int : " + i);
		  System.out.println("value of d after converting it to byte : " + b);
		  System.out.println("value of d after converting it to short : " + s);
		  System.out.println("value of d after converting it to long : " + l);
		  System.out.println("value of d after converting it to float : " + f);
		  System.out.println("value of d after converting it to double : " + m);
		  
	}

}
