package Practice_Set;

 class Employee{
	 private int id;
	 private String name;
	 private int age;
	 private static int nextid=1;
	 
	 
 public Employee(String name,int age) {
	 this.name = name;
	 this.age = age;
	 this.id = nextid++;
	 
 }
 
 
 public void show() {
	 
	 System.out.println("id = "+ id + "\nname = "+ name + "\nage = "+ age);
 }
 
 public void showNextId() {
	 System.out.println("Next emplooye id will be : "+nextid);
 }
 
 protected void finalize() {
	 --nextid;
 }
	 
	 
 }
 
 
  public class GC_Example {
	  
	  public static void main(String[] args) {
		
		Employee a = new Employee("rushi", 10);
		Employee b = new Employee("megha", 20);
		Employee c = new Employee("shiv", 30);
		
		a.show();
		b.show();
		c.show();
		
		a.showNextId();
		b.showNextId();
		c.showNextId();
		
		{
		
		Employee d = new Employee("jeet", 40);
		Employee e = new Employee("don", 50);
		
		d.show();
		e.show();
		
		d.showNextId();
		e.showNextId();
		
		
		d = e = null;
		
		System.gc();
		
		System.runFinalization();
	//	Runtime.getRuntime();
		
		a.showNextId();

		
		
	  
	}

}
  }
