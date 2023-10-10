package Collections;

public class GenericArraylist {

	public static void main(String[] args) {
		
      Abcd<Integer> a = new Abcd<Integer>();
        
       a.add(10);
       a.add(20);
       a.add(30);
       a.add(40);
       a.add(50);
       a.add(60);
       a.add(70);
          
       a.print();

	}

}

class Abcd<p>
{
	private p[] a = (p[])new Object[3];
	private int index = 0;
	
	void add(p num)
	{
		if(index<a.length)
		{
			a[index++] = num;
		}
		else
		{
			int size = (int)(1.5*a.length);
			p[] b = (p[]) new Object[size];
			
			for (int i = 0; i < a.length; i++) {
				
				b[i] = a[i];
			}
			a=b;
			a[index++] = num;
			
		}
	}
	
	void print()
	{
		for (int i = 0; i <index; i++) {
			
			System.out.println(a[i]+" ");
		}
	}
}
