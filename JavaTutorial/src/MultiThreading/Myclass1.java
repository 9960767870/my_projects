package MultiThreading;

class Shop{
	
	int pen = 2;
	public synchronized void counsumer()
	{
		if(pen==0)
		{
			try {
				wait();
			} 
			catch (Exception e) {
				
			}
		}
			pen--;
			System.out.println(pen);
			
			if(pen<10)
				notify();
		}
	
	
	public synchronized void produser()
	{
		{
			if(pen>100)
			{
				try {
					wait();
				}
				catch (Exception e) 
				{
				}
			}
				pen++;
				System.out.println(pen);
				if(pen>10)
					notify();
			}
		}
	}


class Produser extends Thread
{
	Shop shop;
	
	public Produser(Shop shop) {
		
		this.shop = shop;
	}



	public void run() {
	
		while(true)
		{
			shop.produser();
			
			try
			{
				Thread.sleep(10);	
			}
			catch (Exception e) {
			
			}
			
		}
	}
}

class Counsumer extends Thread
{
	Shop shop;
	
	
	public Counsumer(Shop shop) {
		
		this.shop = shop;
	}


	public void run() {
		
		while(true)
		{
			shop.counsumer();
			
			try
			{
				Thread.sleep(100);	
			}
			catch (Exception e) {
			
			}
			
		}
	}
	
	
}

public class Myclass1 {

	public static void main(String[] args) {
		
    Shop shop = new Shop();
    
    Produser p = new Produser(shop);
    
    Counsumer c = new Counsumer(shop);
    
    p.start();
    c.start();
		
	}

}
