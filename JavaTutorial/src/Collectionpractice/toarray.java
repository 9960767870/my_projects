package Collectionpractice;

import java.util.Arrays;

public class toarray<g>
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
	
	g[] toarray()
	{
		g[] b = (g[]) new Object[index];
		
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
	public static void main(String[] args) {
		
		toarray<Integer> a = new toarray<Integer>();
		
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.print();
		
		System.out.println(Arrays.toString(a.toarray()));

	}

}
