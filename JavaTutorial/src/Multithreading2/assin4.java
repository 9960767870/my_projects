package Multithreading2;

public class assin4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		blue1 b = new blue1();
		b.start();
		
		red1 r = new red1();
		r.start();
	}

}

class Fifthfloor1
{
	public static synchronized void m1()
	{
		System.out.println("5-1");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Sixthfloor1.m2();
	}
	public static synchronized void m2()
	{
		System.out.println("5-2");
	}
}

class Sixthfloor1
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
		
		Fifthfloor1.m2();
	}
	
	public static synchronized void m2()
	{
		System.out.println("6-2");
	}
}

class blue1 extends Thread
{
	@Override
	public void run() {
		
		Fifthfloor1.m1();
	}
}

class red1 extends Thread
{
	@Override
	public void run() {
	Sixthfloor1.m1();
	}
}
