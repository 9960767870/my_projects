package MultiThreading;


class A extends Thread
{
	@Override
	public void run() {
		
		for (int i = 0; i < 100000; i++) {
			
		
		Addition.add();
		}
	}
}

class B extends Thread
{
	@Override
	public void run() {
	
		for (int i = 0; i < 100000; i++) {
			
		
		Addition.add();
		}
	}
}

class Addition extends Thread
{
	static int i =0;
	
	public synchronized static void add()
	{
		i=i+1;
	}
}
public class Synchronyzition {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		A a = new A();
		
		B b = new B();
		
		a.start();
		b.start();
		
		a.join();
		b.join();
		
		System.out.println(Addition.i);
		
	}

}
