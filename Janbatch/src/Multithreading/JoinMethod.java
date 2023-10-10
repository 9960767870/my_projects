package Multithreading;

public class JoinMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		MyThread1 m1 = new MyThread1();
		
		MyThread2 m2 = new MyThread2();
		
		m1.start();
		m1.join();
		
		m2.start();
		m2.join();
		
	}

}

class MyThread1 extends Thread
{
	
	@Override
	public void run() {
		
		for (int i = 0; i <10; i++) {
			
			System.out.println("hi");
		}
	}
}

class MyThread2 extends Thread
{
	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			
			System.out.println("hello");
		}
	}
}