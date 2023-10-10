package multiTread;

class a extends Thread{
	
	@Override
	public void run() {
		int a=0;
		while(a<10) {
			System.out.println("Thread-1");
			a++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
}

class b extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
         System.out.println("");
	}
}

public class Denom {

	public static void main(String[] args) {
		
		a aa = new a();
		aa.start();
		
		
		
		b bb = new b();
	   bb.setDaemon(true);
	   System.out.println(aa.isDaemon());
	   System.out.println(bb.isDaemon());
	   
	   bb.start();
	   
		

	}

}
