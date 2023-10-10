package MultiThreadingparctice;


class A extends Thread
{

	public void run() {
		
		for (int i = 0; i < 1000; i++) {
			
			Addition.add();
		}
	}
}

class B extends Thread
{
	@Override
	public void run() {
		
		for (int i = 0; i < 1000; i++) {
			
		
		Addition.add();
	}
	}
}

class Addition 
{
	static int i=0;
	public static synchronized void add()
	{
		i=i+1;
	}
}
public class Sychronization {

	public static void main(String[] args) throws Exception {
		
		A a = new A();
		B b = new B();
        
		a.start();
		b.start();
		
		a.join();
		b.join();
		
		System.out.println(Addition.i);
		
	
	}

}
