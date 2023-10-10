package Constructor;

class Employee{
	
	int id;
	String name;
	int salary;
	
	public Employee() {
		
	}

	public Employee(int id, String name, int salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public void display() {
		System.out.println(id+" "+name+" "+salary);
	}
	
	
}

public class MyClass7 {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.display();
		
		Employee e1 = new Employee(007, "Rushi", 40000);
		e1.display();

	}

}
