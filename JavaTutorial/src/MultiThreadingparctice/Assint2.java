package MultiThreadingparctice;

public class Assint2 {

	public static void main(String[] args) {
		
		orange o = new orange();
				
		yellow y = new yellow();		
		
		o.start();
		y.start();
	     

	}

}

class First 

{
	public static synchronized void m1() {
		System.out.println("5-1");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Second.m2();
	    
	}
	
	public static synchronized void m2()
	{
		System.out.println("5-2");
	}
}

class Second 
{
	
	public static synchronized void m1()
	{	
		System.out.println("6-1");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		First.m2();
	
	}
	
	public static synchronized void m2()
	{
		System.out.println("6-2");
	}
}

class orange extends Thread
{
	@Override
	public void run() {
		First.m1();
	}
}

class yellow extends Thread
{
	@Override
	public void run() {
		Second.m1();
	}
}
