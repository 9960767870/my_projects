package MultiThreadingparctice;

class Shop
{
	int pen = 2;
	
	public synchronized void produser()
	{
		if(pen>100)
		{
			try {
				wait();
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		pen++;
			System.out.println(pen);
			
			
			if(pen>10)
				notify();
		}
	
	
	public synchronized void consumar()
	{
		if(pen==0)
		{
	
			try {
				wait();
			}
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		pen--;
		System.out.println(pen);
		
		
		if(pen<10)
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
		}
		catch (InterruptedException e) 
		{
			
			e.printStackTrace();
		}
		}
	}
	
}

class Consumar extends Thread
{
	Shop shop;
	public Consumar(Shop shop) {
		this.shop = shop;
	}
	
	@Override
	public void run() {
		
		
		while(true)
		{
		shop.consumar();
		
		try {
			Thread.sleep(100);
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		}
	}
}

public class produserConsumar {

	public static void main(String[] args) {
		
		Shop shop = new Shop();
		
		Consumar c = new Consumar(shop);
		Produser p = new Produser(shop);
		
		c.start();
		p.start();

	}

}
