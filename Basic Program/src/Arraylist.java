import java.util.Arrays;

public class Arraylist <p>
{
     private p[] a = (p[]) new Object[4];
	private int index = 0;
	
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
		for (int i =index-1; i>=0; i--) 
		{
		
			if(a[i]==data)
				return i;
		}
		return -1;
	}
	
	boolean contains(p data)
	{
		for (int i = 0; i < a.length; i++) {
			if(a[i]==data)
				return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		
		String s = "[";
		
		for (int i = 0; i <index; i++) 
		{
		     s =s+a[i]+" ";
		     
		     if(i+1==0)
		    	 s=s+", ";
		}
		s=s+"]";
		return s;
	}
	
	p[] toarray()
	{
	     p[] b = (p[]) new Object[index];
	     
	     for (int i = 0; i < b.length; i++) {
			 
	    	  b[i]=a[i];
		}
	     return b;
		
	}
	
	void remove(int i)
	{
		if(i>0)
		{
			if(i+1<=index)
			{
				for(;i+1<index;i++)
				{
					a[i]=a[i+1];
				}
				index--;
			}
		}
	}
	
	int size()
	{
		if(index<a.length)
		{
			index++;
		}
		return index;
	}
	
	p get(int i)
	{
		return a[i];
	}
	
	void print()
	{
		for (int i = 0; i <index; i++) {
			System.out.println(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		
		Arraylist<Integer> a = new Arraylist<Integer>();
		
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		
		System.out.println(a.indexof(50));
		
		System.out.println(a.lastindexof(50));
		
		System.out.println(a.contains(60));
		
		System.out.println(a.size());
		
		System.out.println(a);
		
		
		System.out.println(Arrays.toString(a.toarray()));
		
		a.remove(5);
		System.out.println(a);
		//a.print(); 

	}

}

