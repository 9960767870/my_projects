package MultiThreadingparctice;

class Shop1
{
	int pen=2;
	
	public synchronized void consumer()
	{
		if(pen==0)
		{
		try {
			wait();
		} 
		catch (InterruptedException e) 
		{
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
	
}

class Producer extends Thread{
	 
	Shop1 shop;
	
	public Producer(Shop1 shop) {
		this.shop = shop;
	}
	
	@Override
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

class Consumer extends Thread
{
	Shop1 shop;
	
	public Consumer(Shop1 shop) {
		this.shop = shop;
	}
	
	@Override
	public void run() {
		
		while(true)
		{
			shop.consumer();
			
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

public class Assint1 {

	public static void main(String[] args) {
		
		Shop1 shop = new Shop1();
		
		Consumer c = new Consumer(shop);
		Producer p = new Producer(shop);
		
		c.start();
		p.start();

	}

}
