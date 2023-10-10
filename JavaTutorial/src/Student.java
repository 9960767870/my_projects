import java.util.Scanner;

public class Student {
	
	Scanner scan=new Scanner(System.in);
	
	String name;
	int marks;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void get_details() {
		
		System.out.println("enter your name");
		name=scan.next();
		
		System.out.println("enter your marks");
		marks=scan.nextInt();
		
	}
	
	public void show_details() {
		
		System.out.println("name of student is:+name");
		System.out.println("marks of student are:+marks");
		setName("asas");
		
	}

}
		
	

		
	 
	
		
			
	
	


