package Multithreading;

public class YieldMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread1 t1 = new Thread1();
		t1.start();
		
		Thread2 t2 = new Thread2();
		t2.start();
	}

}

class Thread1 extends Thread
{
	
	@Override
	public void run() {
		
		for (int i = 0; i <10000; i++) {
			yield();
			System.out.println("hi");
		}
	}
}

class Thread2 extends Thread
{
	@Override
	public void run() {
		
		for (int i = 0; i <10000; i++) {
			
			System.out.println("hello");
		}
	}
}
