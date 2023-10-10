package Collectionpractice;

public class removemethod<r>
{

	private r[] a = (r[]) new Object[4];
	
	private int index = 0;
	
	void add(r num)
	{
		if(index<a.length)
		{
	       a[index++] = num;
	    }
		else
		{
			int size = (int) (1.5*a.length);
			
			r[] b = (r[]) new Object[size];
			
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
	
	void print()
	{
		for (int i = 0; i <index; i++) {
			
			System.out.println(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		
            removemethod<Integer> a = new removemethod<Integer>();
            
            a.add(10);
            a.add(20);
            a.add(30);
            a.add(40);
            a.add(50);
            a.add(60);
            a.add(70);
            
            a.remove(4);
            
            a.print();
		
	}

}


