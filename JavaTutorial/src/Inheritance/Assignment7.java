package Inheritance;

class Vehical{
	
	String name = "Splender";
	int modelno = 2167;
	int price = 70000;
	String servicestation = "Akluj";
	
	public Vehical() {
		// TODO Auto-generated constructor stub
	}
	
	public void display() {
		
		System.out.println(name);
		System.out.println(modelno);
		System.out.println(price);
		System.out.println(servicestation);
	}
	
	
}

class Bike extends Vehical{
	double discountrate = 0.05;

public Bike() {
	// TODO Auto-generated constructor stub
}

	public void display1() {
	
		System.out.println(name);
		System.out.println(modelno);
		System.out.println(price);
		System.out.println(servicestation);
		System.out.println(discountrate);
		
	}
	
	public void discount() {
		
		double discount = price*discountrate;
		System.out.println("discount rate is: "+discount);
	}
	
	
}

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bike b = new Bike();
		b.display();
		b.display1();
		b.discount();
		
	}

}
