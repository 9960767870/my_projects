package Collectionpractice;

public class GenericArraylist {

	public static void main(String[] args) {
		
		Abcd<Character> a = new Abcd<>();
		
		a.add('r');
		a.add('u');
		a.add('s');
		a.add('h');
		a.add('i');
		 
		a.print();
		

	}

}

class Abcd<p>
{
	
	private p[] a = (p[]) new Object[4];
	private int index =0;
	
	
	void add(p num)
	{
		
	if(index<a.length)
	{
		
		a[index++] = num;
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
		for (int i = 0; i <index; i++) {
			System.out.println(a[i]+" ");
		}
	}
}
