package MultiThreading;

public class JoinMethod {

	public static void main(String[] args) throws InterruptedException {
		
		First f = new First();
		
		Second s = new Second();
		
		s.start();
		f.start();
		
		f.join();
		s.join();
		
		
	}
	
}

class First extends Thread
{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("hii");
		}
	}
	
}

class Second extends Thread
{
	@Override
	public void run() {
		for (int i = 0; i <10; i++) {
			
			System.out.println("hello");
		}
	}
}
