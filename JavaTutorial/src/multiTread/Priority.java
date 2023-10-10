package multiTread;

 class d extends Thread{
	 @Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		}
		
	}
 }

public class Priority {

	public static void main(String[] args) {
		d dd = new d();
		
		
		dd.setName("Thread-1");
		
		
		dd.start();
		
		System.out.println(dd.MIN_PRIORITY);
		
		dd.setPriority(1);
		
		
		
		
		

	}

}
