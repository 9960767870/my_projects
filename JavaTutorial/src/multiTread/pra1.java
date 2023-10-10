package multiTread;

public class pra1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Shop shop = new Shop();
		 Cunsumer c = new Cunsumer(shop);
		 Produser p = new Produser(shop);
		 
		 c.start();
		 p.start();
		
	}

}

class Shop
{
	int pen = 2;
	
	public synchronized void cunsumer()
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
	
	public synchronized void produser()
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

class Produser extends Thread
{
	Shop shop;
	public Produser(Shop shop) {
		this.shop = shop;
	}
	
	@Override
	public void run() {
		
		while(true)
		{
			shop.produser();
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Cunsumer extends Thread
{
	Shop shop;
	
	public Cunsumer(Shop shop) {
		// TODO Auto-generated constructor stub
		this.shop = shop;
	}
	
	@Override
	public void run() {
		
		while(true)
		{
			shop.cunsumer();
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
