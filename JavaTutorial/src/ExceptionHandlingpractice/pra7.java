package ExceptionHandlingpractice;

public class pra7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		green g = new green();
		
		mango m = new mango();
		
		g.start();
		m.start();
		
	}

}

class OneFloor 
{
	
	public static synchronized void m1()
	{
		System.out.println("1-1");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		TwoFloor.m2();
	}
	
	public static synchronized void m2()
	{
		
		System.out.println("1-2");
	}
	
}

class TwoFloor
{
	public static synchronized void m1()
	{
		
		System.out.println("2-1");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		OneFloor.m2();
	}
	
	public static synchronized void m2()
	{
		System.out.println("2-2");
	}
	
}

class green extends Thread
{
	@Override
	public void run() {
		OneFloor.m1();
	}
}

class mango extends Thread
{
	@Override
	public void run() {
		TwoFloor.m1();
	}
}
