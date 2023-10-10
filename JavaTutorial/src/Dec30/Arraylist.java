package Dec30;

import java.util.Arrays;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Myarray<Integer> m = new Myarray();
		m.add(10);
		m.add(20);
		m.add(30);
		m.add(40);
		m.add(50);
		m.print();
		
		System.out.println(m.indexof(40));
		System.out.println(m.lastindexof(50));

		System.out.println(m.size());
		
		
		
		System.out.println(m.contains(50));
		
		System.out.println(m);
		
		m.remove(4);
		
		System.out.println(Arrays.toString(m.toarray()));
	}

}

class Myarray<p>
{
	private p[] a = (p[]) new Object[4];
	private int index=0;
	
	void add(p num)
	{
		if(index<a.length)
		{
			      a[index++]=num;
		}
		else
		{
			int size = (int) (1.5*a.length);
			p[] b = (p[]) new Object[size];
			
			for (int i = 0; i <a.length; i++) 
			{
				b[i]=a[i];
			}
			a=b;
			a[index++]=num;
		
		}
	}
	
	p get(int i)
	{
		return a[i];
	}
	
	int indexof(p data)
	{
		for (int i = 0; i <index; i++) {
			
			if(a[i]==data)
				return i;
		}
		return -1;
	}
	
	int lastindexof(p data)
	{
		for (int i = index-1; i>=0; i--) 
		{
			if(a[i]==data)
				return i;
		}
		return -1;
	}
	
	boolean contains(p data)
	{
		for (int i = 0; i <index; i++) {
			if(a[i]==data)
				return true;
		}
		return false;
	}
	
	int size()
	{
	   if(index<a.length-1)
	   
		   index++;
		   return index;
		   
	}
	
	void remove(int i)
	{
		if(i>0)
		{
			if(i<=index)
			{
				for(;i+1<index;i++)
				{
					 a[i]=a[i+1];
				}
				index--;

			}
		}
	}
	
	@Override
	public String toString() {
		
		String s = "[";
		
		for (int i = 0; i <index; i++) {
			
			s=s+a[i];
			
			if(i+1!=index)
			{
				s=s+", ";
				
			}
		}
		s=s+"]";
		return s;
	}
	
	p[] toarray()
	{
		p[] b = (p[]) new Object[index];
		
		for (int i = 0; i < index; i++) {
			
			b[i]=a[i];
		}
		return b;
	}
	
	void print()
	{
		for (int i = 0; i <index; i++) {
			System.out.println(a[i]+" ");
		}
	}
	
}
