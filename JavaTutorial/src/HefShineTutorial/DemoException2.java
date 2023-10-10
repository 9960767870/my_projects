package HefShineTutorial;

import java.util.Scanner;

class ValidAgeExcetion extends Exception{
	
	public ValidAgeExcetion(String str) {
		 super(str);
	}
	
}

public class DemoException2 {
	
	
	static void checkage(int age) throws ValidAgeExcetion {
		
		
		if(age<18) {
			  
			throw new ValidAgeExcetion("Age is not valid");
			
		} else {
			System.out.println("Succesfull");
		}
	 
	}
	
	static void show() {
		int a = 100;
		int b = 2;
		int sc[] = new int[3];
		try {
			int c = a/b;
			System.out.println(c);
			
		}
		catch(ArithmeticException a1) {
			System.out.println("ArithmeticException");
		}
		try {
			System.out.println(sc[6]);
		}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("ArrayIndexOutOfBoundsException");
			}
		
		
		try {
			String s = "null";
			System.out.println(s.charAt(0));
		}
		catch(NullPointerException n) {
			System.out.println("NullPointerException");
		}
		
		
	}
	
	

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
       show();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
        String name = sc.next();
        
        System.out.println("Enter your age");
        int age = sc.nextInt();
        
     
       
        try {
			checkage(age);
		} catch (ValidAgeExcetion e) {
			// TODO Auto-generated catch block
			System.out.println("infinate");
			System.out.println(e);
		}
        
        System.out.println("Enter details");
        System.out.println("name : "+name);
        System.out.println("Age : "+age);
        
       
	}

}
