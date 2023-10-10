package OopsConcept;

public class Abstraction {

	public static void main(String[] args) 
	{
        Car c= new Car();
        c.start();
        
        Scotter s = new Scotter();
        s.start();

	}

}

abstract class Vahical
{
	int noofvahicaltyer;
	abstract void start();
	
	
}

class Car extends Vahical 
{
	
	void start() {
		
		System.out.println("noofvahicaltyer:"+4);
		System.out.println("Car Starts With Key");
		
	}
	
}

class Scotter extends Vahical
{

	@Override
	void start() {
		System.out.println("noofvahicaltyer:"+3);
		System.out.println("Scotter Starts With Kick");
		
	}
	
}