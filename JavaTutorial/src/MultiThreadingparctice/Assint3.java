package MultiThreadingparctice;

 class tukan {
	 
	  int pen = 2;
	 public  synchronized void grahak()
	 {
		 if(pen==0)
		 {
			 try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		 
		 pen--;
		 System.out.println(pen);
		 
		if(pen<10)
			notify();
		 
	 }
	 
	 public synchronized void vyapari()
	 {
		 if(pen>100)
		 {
			 try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		 pen++;
		 System.out.println(pen);
		 
		 if(pen>10)
			 notify();
	 }

	
 }
 
 class grahak extends Thread
 {
	 tukan t;
	 public grahak(tukan t) {
		this.t = t;
	}
	 
	 

	@Override
	public void run() {
		
		 
		 while(true)
		 {
			 t.grahak();
			 try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
	}
	 
 }
 
 class vyapari extends Thread
 {
	 tukan t;
	 
	 public vyapari(tukan t) {
	
		 this.t = t;
	}
	 
	 @Override
	public void run() {
		
		 
		 while(true)
		 {
			 t.vyapari();
			 try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
	}
 }


public class Assint3 {

	public static void main(String[] args) {
		
		tukan t = new tukan();
		
		grahak c = new grahak(t);
		
		vyapari p = new vyapari(t);

		c.start();
		p.start();
	}

}
