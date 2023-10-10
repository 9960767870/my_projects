package HefShineTutorial;

//super keyword with variable
//class Vehical{
//	
//	int maxspeed = 100 ;
//	
//}
//
//class Car extends Vehical{
//	int maxspeed = 180 ;
//	
//	void display() {
//		System.out.println("maxspeed" + super.maxspeed);
//	}
//}



//super keyword with method
//class Animal{
//	void message() {
//		System.out.println("This is Animal");
//	}
//	
//}
//
//class dog extends Animal{
//	void message() {
//		System.out.println("This ia dog");
//	}
//	void display() {
//		
//		// will invoke or call current class message() method
//		message();
//		
//		// will invoke or call parent class message() method
//		super.message();
//	}
//	
//}



//super keyword with constructor
class Parent
{
	 Parent() {
		System.out.println("This ia parent constructor");
	}
	
}

class Child extends Parent
{
	 Child() {
		
		 // invoke or call parent class constructor
		super();
		
		System.out.println("This is child costructor");
	}
	
	
	
}

public class Super {

	public static void main(String[] args) {
		//super keyword with variable
//		Car s = new Car();
//		s.display();
		
		//super keyword with method
//		dog d = new dog();
//		d.display();
		
		
		Child c =new Child();
		
		

	}

}
