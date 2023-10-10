package AbstractClass;

 abstract class Vahical{
	 
	 public abstract void  numWheels(int a,int b);
	 
 }
 
 class Car extends Vahical{

	int a;
	int b;
	
	public void numWheels(int a,int b) {
		this.a = a;
		this.b = b;
		System.out.println(a+" "+b);
		
	}

	 
	 
 }
 
 class Truck extends Vahical{

	 int c ;
	 int d ;
	 
	@Override
	public void numWheels(int c,int d) {
		this.c = c;
		this.d = d;
		System.out.println(c+" "+d);
		
	}
	 
 }

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c = new Car();
		c.numWheels(2, 2);
		
		Truck t = new Truck();
		t.numWheels(4, 4);
		
	}

}
