package multiTread;

class Choclates{
	
	int choc = 0;
	
	synchronized int check() {
		
		if(choc<10) {
			try {
				
				System.out.println(Thread.currentThread().getName()+"is waiting....");
				wait();
			} catch (InterruptedException e) {
				System.out.println("Exception occured");
			}
		}
			else {
				
				try {
				Thread.sleep(1000);
			}
				catch(InterruptedException e) {
					System.out.println("Exception occured");
			}
				choc = choc - 7;
				System.out.println("Remaing choclets after consuming:"+choc);
				notify();
		}
		return choc;
		
	}
	
	synchronized int make(int n) {
		
		if(choc>=15) {
			try {
				
				System.out.println(Thread.currentThread().getName()+"is waiting...");
				wait();
			} catch (InterruptedException e) {
				System.out.println("Exception....");
			}
		}
		
		choc = choc+n;
		System.out.println("choclets produced.."+choc);
		notify();
		return choc;
		
	}
}

class Consumar implements Runnable{
	Choclates t;
	public Consumar(Choclates t) {
        this.t = t;
        
        new Thread(this,"Consumar").start();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			t.check();
		}
	}
	
}

class Producer implements  Runnable {

	Choclates t;
	 public Producer(Choclates t) {
	 
        this.t = t;
        
        new Thread(this,"Producer").start();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i=10;
		int ch = 0;
		
		while(ch<10) {
			
			t.make(i);
			ch++;
		}
		}
	}
	


public class ProblemPC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Choclates obj = new Choclates();
		new Producer(obj);
		new Consumar(obj);

	}

}
