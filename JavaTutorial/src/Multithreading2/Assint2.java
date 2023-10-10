package Multithreading2;

public class Assint2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		A a = new A();
		a.start();
		
		B b = new B();
		b.start();
		
		a.join();
		b.join();
		
		System.out.println(Addition.i);

	}

}

class Addition
{
	static int i=0;
	public static synchronized void add()
	{
		  i=i+1;
		
	}
}

class A extends Thread
{
	@Override
	public void run() 
	{
		for (int i = 0; i <10000; i++) 
		{
		    Addition.add();	
		}
	}
}

class B extends Thread
{
	@Override
	public void run() 
	{
		for (int i = 0; i <10000; i++) 
		{
		 Addition.add();	
		}
	}
}
