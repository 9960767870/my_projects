package Ooops;

public abstract class Abstraction2 
{
	public abstract void add(int num1,int num2);
	public abstract void sub(int num1,int num2);
	public abstract void mul(int num1,int num2);
	public abstract void div(int num1,int num2);

	public static void main(String[] args) 
	{ 
		
	    Boss b = new Boss();
	    b.add(10, 10);
	    b.sub(20, 10);
	    b.mul(10, 10);
	    b.div(100, 10);

	}

}

class Boss extends Abstraction2
{

	@Override
	public void add(int num1, int num2) {
		
		System.out.println("Addition is:"+(num1+num2));
	}

	@Override
	public void sub(int num1, int num2) {
		
		System.out.println("Substraction is:"+(num1-num2));
	}

	@Override
	public void mul(int num1, int num2) {
		
		System.out.println("Multiplication is:"+(num1*num2));
	}

	@Override
	public void div(int num1, int num2) {
	
		System.out.println("Divition is:"+(num1/num2));
		
	}
	
}
