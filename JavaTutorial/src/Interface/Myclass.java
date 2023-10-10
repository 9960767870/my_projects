package Interface;

interface Student{
	
	public void studentName();
	
	public void age();
	
	public void marks();
	
	
}

 interface Employee{
	 
	 public void id();
	 public void employeeName();
	 public void salary();
 }
 
 class Manager implements Student,Employee{

	@Override
	public void id() {
		// TODO Auto-generated method stub
		System.out.println("The student id is = 9696");
	}

	@Override
	public void salary() {
		// TODO Auto-generated method stub
		System.out.println("The student salary is = 40000");
	}

	

	@Override
	public void age() {
		// TODO Auto-generated method stub
		System.out.println("The student age is = 22");
	}

	@Override
	public void marks() {
		// TODO Auto-generated method stub
		System.out.println("The student marks is = 90");
	}

	@Override
	public void employeeName() {
		// TODO Auto-generated method stub
		System.out.println("The employee name is sachin");
	}

	@Override
	public void studentName() {
		// TODO Auto-generated method stub
		System.out.println("The student name is rushikesh");
	}
	 
	 
 }

public class Myclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		 Manager m =new Manager();
		 m.studentName();
		 m.age();
		 m.marks();
		 m.employeeName();
		 m.id();
		 m.salary();
	}

}
