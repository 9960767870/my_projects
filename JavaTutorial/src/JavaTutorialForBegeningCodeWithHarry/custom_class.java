package JavaTutorialForBegeningCodeWithHarry;

class Employee{
	int id;
	int salary;    
	String name;
}
	
    public class custom_class {
    		
	public static void main(String[] args) {
		
	
		
		System.out.println("This is custom class");
		
		Employee e1 = new Employee();
		
		
		e1.id = 45;
		e1.salary = 30000;
		e1.name = "Rushi";
		
		System.out.println(e1.id);
		System.out.println(e1.name);
		System.out.println(e1.salary);
		
		
	}
}
