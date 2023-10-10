package Practice_Set;


 class Parent6{
	 
	  void show() {
		 
		 System.out.println("Upcasting for parent class method");
	 }
 
	 
 }
 class Child6 extends Parent6{
	 
	  void show() {
		 System.out.println("Upcasting for child cladd method");
	 }
 }
 
 
public class Upcasting_Example {
	
	public static void main(String[] args) {
		 
		Parent6 obj = new Child6();
		
		obj.show();
	}
}


