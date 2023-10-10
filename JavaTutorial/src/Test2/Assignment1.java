package Test2;

class Employee{
	Long employeeId ;
	String employeeName; 
	String employeeAddress; 
	Long employeePhone; 
	Double basicSalary;
	double specialAllowance = 250.80;
	double Hra = 1000.50;
	

	
	public Employee(Long employeeId, String employeeName, String employeeAddress, Long employeePhone,
			Double basicSalary, double specialAllowance, double hra) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeePhone = employeePhone;
		this.basicSalary = basicSalary;
		this.specialAllowance = specialAllowance;
		this.Hra = hra;
	}
	public Employee() {
		
	}

	
	public void  calculateSalary () {
		 double salary = basicSalary + 
				 (basicSalary *specialAllowance/100) +(basicSalary*Hra/100);
		 System.out.println(salary);
	}
	
	
}

class Manager extends Employee{

	public Manager(long id,String name,String address,long phone,double salary) {
		// TODO Auto-generated constructor stub
		this.employeeId = id;
		this.employeeName = name;
		this.employeeAddress = address;
		this.employeePhone = phone;
		this.basicSalary = salary;
		System.out.println(id+" "+name+" "+address+" "+phone+" "+salary);
	}
	
		
	}
	
class Trainee extends Employee{

	public Trainee(long id,String name,String address,long phone,double salary) {
		super();
		this.employeeId = id;
		this.employeeName = name;
		this.employeeAddress = address;
		this.employeePhone = phone;
		this.basicSalary = salary;
		System.out.println(id+" "+name+" "+address+" "+phone+" "+salary);
	
	}
	
}
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Manager m = new Manager(100, "Rushi", "akluj", 99607678, 40000);
     m.calculateSalary();
     
     Trainee t = new Trainee(200, "mohit", "dubai",9999999,50000);
     m.calculateSalary();
		
	}

}
