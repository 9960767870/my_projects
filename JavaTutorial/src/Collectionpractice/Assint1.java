package Collectionpractice;

public class Assint1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Array<String> a = new Array<>();
		a.add("rushi");
		a.add("sachin");
		a.add("varad");
		a.add("don");
		a.add("shiv");
		a.add("megha");
		
		a.print();
	}

}

class Array<p>
{
	private p[] a = (p[]) new Object[4];
	private int index = 0;
	
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
			
			for (int i = 0; i < a.length; i++) {
				
				        b[i]=a[i];
			}
			a=b;
			a[index++]=num;
		}
	}
	
	void print()
	{
		for (int i = 0; i < index; i++) {
			
			System.out.println(a[i]+" ");
		}
	}
	
}
