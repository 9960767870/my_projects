package multiTread;

class Mythread implements Runnable{
	 @Override
	public void run() {
		// TODO Auto-generated method stub
		
		 for(int i=0;i<5;i++) {
				System.out.println(Thread.currentThread().getName());
			}
	}
}

class Mythread2 implements Runnable {
	

	 @Override
	public void run() {
		// TODO Auto-generated method stub
		 for(int i=0;i<5;i++) {
				System.out.println(Thread.currentThread().getName());
			}
		
	 }
}

public class RunnableThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Mythread ob = new Mythread();
		 Mythread2 obj = new Mythread2();
		 
		 Thread t1 = new Thread(ob);
		 Thread t2 = new Thread(obj);
		 
		 t1.start();
		 t2.start();
	}

}
