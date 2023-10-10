package Collectionpractice;

public class lastindexof<r> 
{

	private r[] a = (r[]) new Object[4];
	
	private int index = 0;
	
	void add(r num)
	{
		if(index<a.length)
		{
		a[index++] = num;
		}
		else
		{
			int size = (int) (1.5*a.length);
			
			r[] b = (r[]) new Object[size];
			
			for (int i = 0; i < a.length; i++) {
				
				           b[i]=a[i];
			}
			a=b;
			a[index++] = num;
		}
	}
	
	int lastindex(r data)
	{
		for (int i =index-1; i>=0; i--) {
			
			if(a[i]==data)
			{
				return i;
			}
		}
		return -1;
		
	}
	
	void print()
	{
		for (int i = 0; i <index; i++) {
			
			System.out.print(a[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		
		lastindexof<Integer> a = new lastindexof<Integer>();
		a.add(10);
		a.add(20);
		a.add(70);
		a.add(40);
		a.add(50);
		a.add(60);
		a.add(70);
		a.add(80);
		
		System.out.println(a.lastindex(70));
		
		a.print();

	}

}
