package Multithreading2;

public class assint1 {

	public static void main(String[] args) {
		
		blue b = new blue();
		b.start();
		
		red r = new red();
		r.start();

	}

}

class Fifthfloor{
	
	public static synchronized void m1()
	{
		System.out.println("5-1");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Sixthfloor.m2();
	}
	
	public static synchronized void m2()
	{
		System.out.println("5-2");
	}
}

class Sixthfloor{
	public static synchronized void m1()
	{
		System.out.println("6-1");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Fifthfloor.m2();
	}
	
	public static synchronized void m2()
	{
		System.out.println("6-2");
	}
}

class blue extends Thread{
	@Override
	public void run() 
	{
		Fifthfloor.m1();
	}
}

class red extends Thread{
	@Override
	public void run() {
	Sixthfloor.m1();
	}
}
