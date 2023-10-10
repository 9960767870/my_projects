package Arraylist;

public class list<p> 
{

	private p[] a = (p[]) new Object[3];
	private int index=0;
	
	
	void add(p num)
	{
		if(index<a.length)
			
			a[index++]=num;
		
		else
		{
			int size = (int) (1.5*a.length);
			
			p[] b = (p[]) new Object[size];
			
			for (int i = 0; i < a.length; i++) {
				
				            b[i]=a[i];
			}
			a=b;
			 a[index++]=num;
		}
	}
	
	boolean contains(p data)
	{
	
		for (int i = 0; i < index; i++) {
			
			if(a[i]==data)
				
				return true;
			
		}
		return false;
	}
	
	void print()
	{
		for (int i = 0; i <index; i++) {
			System.out.println(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		list<Integer> l = new list<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		
		System.out.println(l.contains(50));
		
		l.print();
	}

}
