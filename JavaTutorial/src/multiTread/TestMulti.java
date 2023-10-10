package multiTread;

 class test extends Thread{
	 @Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
 }
 
 class test2 extends Thread{
	 @Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	 }
 }

public class TestMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test t = new test();
		test2 t2 = new test2();
		
		t.setName("Thread-1");
		t2.setName("Thread-2");
		
		t.start();
		t2.start();

	}

}
