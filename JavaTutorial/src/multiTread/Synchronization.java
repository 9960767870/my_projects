package multiTread;

class avoid extends Thread{
	
	synchronized void m1() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName());
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Synchronization extends Thread {
  
	avoid  t;
	
	public Synchronization() {
		// TODO Auto-generated constructor stub
	}
	
	public Synchronization(avoid t) {
		
	this.t=t;
	 
	 
	
	}
	
	@Override
	public void run() {
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		avoid a = new avoid();
//		a.setName("Thread-1");
//	   a.start();
		Synchronization s = new Synchronization(a);
		s.setName("Thread-1");
		s.setName("Thread-2");
		s.start();
		
		
		
		
		 
		
		
		
		
		
		

	}

}
