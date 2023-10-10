package Encapsulation;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee();
		e.setId(100);
		System.out.println("Student id is :"+e.getId());
		
		e.setName("Rushi");
		System.out.println("Student name is : "+e.getName());
		

	}

}
