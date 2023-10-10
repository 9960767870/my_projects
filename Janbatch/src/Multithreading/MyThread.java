package Multithreading;

public class MyThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Base b = new Base();
		
		Thread t = new Thread(b);
		
		t.start();
		
	}                                                                                                              
                                                                                                 
}

class Base implements Runnable
{

	@Override
	public void run() {
		
		System.out.println("hi");
		
	}
	
}
