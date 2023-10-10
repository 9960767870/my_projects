package Multithreading1;



public class SynchronitionUsingObject {

	public static void main(String[] args) throws InterruptedException {
		
		Abcd abcd = new Abcd();
		
		Base1 b1 = new Base1(abcd);
		b1.start();
		
		Base2 b2 = new Base2(abcd);
		b2.start();
		
		b1.join();
		b2.join();
		
		System.out.println(abcd.i);

	}

}

class Abcd {
	
	int i=0;
	
	public synchronized void add()
	{
		i=i+1;
	}
}

class Base1 extends Thread
{
	Abcd abcd;
	public Base1(Abcd abcd) {
		
		this.abcd=abcd;
	}
	
	
	@Override
	public void run() {
	
		for (int i = 0; i <100000; i++) {
			
			abcd.add();
		}
	}
}

class Base2 extends Thread
{
	Abcd abcd;
	public Base2(Abcd abcd) {
	
		this.abcd=abcd;
	}
	
	@Override
	public void run() {
	
		for (int i = 0; i <100000; i++) {
			
			abcd.add();
		}
	}
}
