package BasicProgram;

import java.util.Scanner;

public class conditional {

	public static void main(String[] args) 
	{
		 int marks =0;
		 String name;
		 int subject = 5;
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("enter the name");
		 name = sc.next();
		 
		 System.out.println("Enter the student marks");
		 
		 marks = sc.nextInt();
		 
		
		 System.out.println("congrats");
		 
		 if(marks>=90)
		 {
			 System.out.println("your student is ninty plus above marks");
		 }
		 
		 else if(marks>=70)
		 {
			 System.out.println("your student is seventy pluse above marks");
		 }
		 
		 else if(marks>=50)
		 {
			 System.out.println("your student is fifty pluse above");
		 }
		 else if(marks>=35)
		 {
			 System.out.println("your student is pass");
		 }
		 else
		 {
			 System.out.println("your student is faill");
		 }
		 
//		 double avg =350/5;
//		 
//		 System.out.println(avg);
		
		 
       
	}

}
