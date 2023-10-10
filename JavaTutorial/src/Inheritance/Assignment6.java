package Inheritance;


class Worker{
	
	String name = "Sachin" ;
	int age =21;
	int phoneno=0303003;
	int salary = 40000;
	String address = "dhankawdi";
	
	public void displaySalary() {
		
		System.out.println("The salary is: "+salary);
	}
	
}

class Employee extends Worker{
	String name = "Rushikesh" ;
	int age =22;
	int phoneno=99999999;
	int salary = 50000;
	String address = "dhankawdi";
	
	String Workspacialization = "GET";
	String Department = "Back End";
	
	public void display() {
	System.out.println(name+" "+age+" "+phoneno+" "+salary+" "+address+" "+Workspacialization+" "+Department);
}}

class Manager extends Worker{
	String name = "Varad" ;
	int age =25;
	int phoneno=92838398;
	int salary = 90000;
	String address = "dhankawdi";
	String Workspacialization = "Cenior Manager";
	String Department = "Front End";
	
	public void display1() {
		System.out.println(name+" "+age+" "+phoneno+" "+salary+" "+address+" "+Workspacialization+" "+Department);
}
}
public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e = new Employee();
e.display();

Manager m = new Manager();

m.display1();
m.displaySalary();
		
	}

}
