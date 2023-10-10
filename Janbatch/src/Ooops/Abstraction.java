package Ooops;

public abstract class Abstraction 
{
	public void add(int num1,int num2)
	{
		System.out.println("Addition is:"+(num1+num2));
	}
	
	public void sub(int num1,int num2)
	{
		System.out.println("Substraction is:"+(num1-num2));
	}
	
	public abstract void mul(int num1,int num2);

	public static void main(String[] args) 
	{
		
            Manager m = new Manager();
            m.add(10, 10);
            m.sub(20, 10);
            m.mul(10, 5);
            m.div(10, 10);
	}

}

abstract class Employee extends Abstraction
{

	@Override
	public void mul(int num1, int num2) 
	{
	    System.out.println("Multiplication is:"+(num1*num2));	
		
	}
	
	public abstract void div(int num1,int num2);
	
}

class Manager extends Employee
{

	@Override
	public void div(int num1, int num2) {
		System.out.println("Divition is:"+(num1/num2));
		
	}
	
}
