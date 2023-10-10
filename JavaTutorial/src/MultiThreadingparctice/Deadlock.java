package MultiThreadingparctice;

class FifthFloor
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
		
		SixthFloor.m2();
		
	}
	
	public static synchronized void m2()
	{
		System.out.println("5-2");
	}
	
}

class SixthFloor
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
		
		
		FifthFloor.m2();
		
	}
	
	public static synchronized void m2()
	{
		System.out.println("6-2");
	}
}

class blue extends Thread
{
	@Override
	public void run() {
		
		FifthFloor.m1();
	}
	
}

class red extends Thread
{
	@Override
	public void run() {
	SixthFloor.m1();
	}
}
public class Deadlock {

	public static void main(String[] args) {
		
      blue b = new blue();
      
      red r = new red();
      
      b.start();
      r.start();

	}

}
