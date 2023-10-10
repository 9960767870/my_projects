package MultiThreading;

class My extends Thread
{
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			
			System.out.println("Boys");
			
		}
	}
}

class My2 extends Thread
{
	@Override
	public void run() {
		
		for (int i = 0; i <100; i++) {
			Thread.yield();
			System.out.println("Girls");
		}
	}
}
public class YaildMethod {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		My m = new My();
		
		My2 mm = new My2();
		
		m.start();
		mm.start();
		
		

	}

}
