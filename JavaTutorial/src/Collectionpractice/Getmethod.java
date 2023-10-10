package Collectionpractice;

public class Getmethod<g>
{

	private g[] a = (g[])new Object[4];
	
	private int index = 0;
	
	void add(g num)
	{
		if(index<a.length)
		{
		       a[index++]=num;
		}
		else
		{
			int size = (int) (1.5*a.length);
			g[] b = (g[])new Object[size];
			
			for (int i = 0; i < a.length; i++) {
				
				             b[i]=a[i];
			}
			a=b;
			a[index++]=num;
		}
	}
	
	g get(int i)
	{
		return a[i];
		
	}
	
	void print()
	{
		for (int i = 0; i < index; i++) {
			
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	
	
	public static void main(String[] args) {
		
      Getmethod<Integer> a = new Getmethod<Integer>();
      
      a.add(10);
      a.add(20);
      a.add(30);
      a.add(40);
      a.add(50);
      a.add(60);
      a.add(70);
      
      System.out.println(a.get(5));
      a.print();
	}

}
