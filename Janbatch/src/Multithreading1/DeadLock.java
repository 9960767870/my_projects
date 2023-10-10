package Multithreading1;

public class DeadLock {

	public static void main(String[] args) {
		
		Thread1 t1 = new Thread1();
		
		Thread2 t2 = new Thread2();
		
		t1.start();
		t2.start();

	}

}

class FifthFloor
{
	
	public synchronized static void m1()
	{
		System.out.println("in m1");
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		SixthFloor.m2();
	}
	
	public synchronized static void m2()
	{
		System.out.println("in m2");
	}
}

class SixthFloor
{
	
	public synchronized static void m1()
	{
		System.out.println("in m1");
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FifthFloor.m2();
	}
	
	public synchronized static void m2()
	{
		System.out.println("in m2");
	}
}

class Thread1 extends Thread
{
	@Override
	public void run() {
	
		FifthFloor.m1();
	}
}

class Thread2 extends Thread
{
	
	@Override
	public void run() {
		
		SixthFloor.m1();
	}
}
