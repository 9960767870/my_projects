package Multithreading2;

public class Assint3 {

	public static void main(String[] args) {
		
		Shop shop = new Shop();
		
		Consumer c = new Consumer(shop);
		
		Produser p = new Produser(shop);
		
		c.start();
		p.start();

	}

}

class Shop
{
	int pen =1;
	
	public synchronized void consumer()
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
			} 
		
		catch (InterruptedException e) {
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

class Consumer extends Thread
{
	Shop shop;
	public Consumer(Shop shop) 
	{
		this.shop=shop;
	}
	
	@Override
	public void run() 
	{
	while(true)
	{
		shop.consumer();
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
	
}

class Produser extends Thread
{
	Shop shop;
	public Produser(Shop shop) {
		
		this.shop = shop;
	}
	
	@Override
	public void run() 
	{
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
