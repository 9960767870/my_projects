package MultiThreading;

class Thread1 extends Thread
{
	public void run()
	{
	
		for (int i = 0; i <10 ; i++) {
			
		System.out.println("hi");
		try
		{
		Thread.sleep(1000);
		}
		catch (Exception e) {
			
		}
	}
		}
}

class Thread2 extends Thread

{
	
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			
		System.out.println("hello");
		
		try
		{
		Thread.sleep(1000);
		}
		catch (Exception e) {
			
		}
	}
}
}
public class Myclass {

	public static void main(String[] args) {
		
		Thread1 t1 = new Thread1();
		t1.start();
		
		Thread2 t2 = new Thread2();
		t2.start();

	}

}
