package Collectionpractice;

public class indexofmethod<t>
{

	private t[] a = (t[]) new Object[4];
	
	private int index = 0;
	
	
	void add(t num)
	{
		if(index<a.length)
		{
			a[index++]=num;
		}
		else
		{
			int size =(int) (1.5*a.length);
			 t[] b = (t[]) new Object[size]; 
			 
			 for (int i = 0; i < a.length; i++) {
				
				       b[i]=a[i];
			}
			a=b;
			a[index++] = num;
			 
		}
	}
	
	int indexof(t data)
	{
		for (int i = 0; i < a.length; i++) {
			
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
			
			System.out.println(a[i]+" ");
		}
	}
	public static void main(String[] args) {
	
		indexofmethod<Integer> a = new indexofmethod<Integer>();
		
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		a.add(70);
		a.add(80);
		
		System.out.println(a.indexof(50));
         a.print();
	}

}
