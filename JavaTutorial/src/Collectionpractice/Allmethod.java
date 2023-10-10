package Collectionpractice;

import java.util.Arrays;

public class Allmethod <t>
{
	private t[] a = (t[]) new Object[4];
	private int index = 0;

	void add(t num)
	{
		if(index<a.length)
		{
		a[index++] = num;
	    }
		else
		{
			int size = (int) (1.5*a.length);
			t[] b= (t[]) new Object[size];
			
			for (int i = 0; i < a.length; i++) {
				
				          b[i]=a[i];
			}
			a=b;
			a[index++]=num;
		}
	}
	
	void remove(int i)
	{
		if(i>=0)
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
	
	t get(int i)
	{
		return a[i];
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
	
	int lastindexof(t data)
	{
		for (int i =index-1; i>=0; i--) {
			
			if(a[i]==data)
			{
				return i;
			}
		}
		return -1;
	}
	
	boolean contains(t data)
	{
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]==data)
			{
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		
	    String	s = "[";
	    
	    for (int i = 0; i <index; i++) {
		
	    s = s+a[i];
	    if(i+1!=index)
	    {
	    	s = s+",";
	    }
	}
	    s=s+"]";
	    return s;
	}
	
	t[] toarray()
	{
		t[] b = (t[]) new Object[index];
		
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
		
		Allmethod<Integer> a = new Allmethod<Integer>();
		
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		
		a.remove(4);
		
		System.out.println(a.indexof(40));
		System.out.println(a.lastindexof(50));
		System.out.println(a.get(2));
		System.out.println(a.contains(20));
		System.out.println(a);
		System.out.println(Arrays.toString(a.toarray()));
		a.print();

	}

}
