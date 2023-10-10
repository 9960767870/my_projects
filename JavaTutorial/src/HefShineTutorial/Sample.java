package HefShineTutorial;

public class Sample {
	int number = 100;
	
	public Sample() {
		Student sc = new Student(this);
		sc.display();
		
	}
	
	public static void main(String[] args) {
	
	Sample s = new Sample();
	

}
}
//	invoke to pass as an argument in the method
	class Student{
		Sample sample;
		Student(Sample sample ){
			this.sample = sample;
			
		}
		void display() {
			System.out.println(sample .number);
		}
	
	}
	
//	Current class instance variable
//	void display(int rollno,String name) {
//		this.rollno = rollno;
//		this.name = name;
//		System.out.println("Rollno is :"+rollno+" "+"Name is :"+name);
//		
//	}
//	
//
//	public static void main(String[] args) {
//		
//		Sample sc = new Sample();
//		sc.display(10, "Rushi");
//		
//	}
	
	
//	invoke current class method 
//	void display() {
//		System.out.println("This is first method");
//		this.show();
//	}
//	
//	void show() {
//		System.out.println("This is second method");
//		this.display();
//	}
//	
//	public static void main(String[] args) {
////		
//		Sample sc = new Sample();
//		
//}
	
	
//	invoke current class costructor
//	Sample(){
//		System.out.println("This is first constructor");
//	}
//	
//	Sample(int rollno,String name){
//		this.rollno = rollno;
//		this.name = name;
//		System.out.println("This is second constructor");
//		
//	}
//	public static void main(String[] args) {
////		
//		Sample sc = new Sample(346,"Rushi");
//	
//	
//}
	
	

