package Multithreading;

public class thread {

	public static void main(String[] args) {

     Base1 b1 = new Base1();
     
     b1.start();
     
     Base2 b2 = new Base2();
     
     b2.start();
		
		}

	}

class Base1 extends Thread
	{
	@Override
	public void run() {
		
    	for (int i = 0; i <100; i++) {
			
    		try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		System.out.println("hiii");
		}
    }
}

class Base2 extends Thread
{
	@Override
	public void run() {
	
		try {
			Thread.sleep(1000);             
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Hello");
	}
}
