package Dec30;

import java.util.Arrays;

public class Assint1<p> 
{

	private p[] a = (p[]) new Object[4];
	private int index  =0;
	
	void add(p num)
	{
		if(index<a.length)
		{
			  a[index++]=num;
		}
		else
		{
			int size = (int)(1.5*a.length);
			p[] b = (p[]) new Object[size];
			
			for (int i = 0; i < a.length; i++) {
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
		for (int i = index-1; i>=0; i--) {
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
		
		for (int i = 0; i < index; i++) {
			
			s = s+a[i];
			if(i+1!=index)
			{
				s=s+", ";
			}
		}
		s=s+"]";
		return s;
	}
	
	int size()
	{
		if(index<a.length-1)
		
			  index++;
			  return index;
		
	}
	
	p[] toarray()
	{
		p[] b = (p[]) new Object[size()];
		
		for (int i = 0; i <index; i++) {
			
			       b[i]=a[i];
		}
		return b;
	}
	
	void print()
	{
		for (int i = 0; i < index; i++) {
			System.out.println(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		
		Assint1<Integer> a = new Assint1<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		
		a.print();
		
		System.out.println(a.indexof(10));
		
		System.out.println(a.lastindexof(50));
		
		System.out.println(a.contains(50));
		
		System.out.println(a.size());
		
		a.remove(2);
		a.print();
		
		System.out.println(a.get(4));

		System.out.println(a);
		System.out.println(Arrays.toString(a.toarray()));
	}

}
