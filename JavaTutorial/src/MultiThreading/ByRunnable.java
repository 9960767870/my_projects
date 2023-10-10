package MultiThreading;

class mythread1 implements Runnable
{
	@Override
	public void run() {
		
		int i=0;
		while(i<40)
		{
			System.out.println("Thread1 is running");
			i++;
		}
		
	}
	
}

class mythread2 implements Runnable
{
	@Override
	public void run() {
		int i=0;
		while(i<40)
		{
			System.out.println("Thread2 is running");
			i++;
		}
		
	}
}
public class ByRunnable {

	public static void main(String[] args) {
		
		mythread1 t1 = new mythread1();
		Thread obj = new Thread(t1);
		obj.start();
		
		
		mythread2 t2 = new mythread2();
		Thread obj2 = new Thread(t2);
		obj2.start();
		

	}

}
