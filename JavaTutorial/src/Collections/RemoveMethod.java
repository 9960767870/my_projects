package Collections;

public class RemoveMethod {

	public static void main(String[] args) {
		
		Myarray<Integer> m = new Myarray<>();
		
		m.add(10);
		m.add(20);
		m.add(30);
		m.add(40);
		m.add(50);
		m.add(60);
		m.add(70);
		
		m.remove(4);
		
		System.out.println(m.get(5));
		
		System.out.println(m.contains(10));
		
		System.out.println(m.indexof(40));
		
		System.out.println(m.latsindexof(70));
		
		System.out.println(m);
		
		System.out.println(m.toArray());
		m.toArray();
		
		//m.print();

	}

}

class Myarray<p>
{
	private p[] a = (p[]) new Object[3];
	private int index = 0;
	
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
	
	p get(int i)
	{
		return a[i];
	}
	
	boolean contains(p data)
	{
		for (int i = 0; i <index; i++) {
			
			if(a[i]==data)
				return true;
		}
		return false;
	}
	
	int indexof (p data)
	{
		for (int i = 0; i <index; i++) {
			
			if(a[i]==data)
				return i;
		}
		return -1;
	}
	
	int latsindexof(p data)
	{
		for(int i=index-1;i>=0;i--)
		{
			if(a[i]==data)
				return i;
		}
		return -1;
	}
	
	@Override
	public String toString() {
		
		String s = "[";
		
		for (int i = 0; i <index; i++) {
			
			s = s+a[i];
			
			if(i+1!=index)
			{
				s = s+", ";
			}
		}
		s = s+"]";
		return s;
		
	}
	
	
	p[] toArray()
	{
		p[] b = (p[]) new Object[index];
		
		for (int i = 0; i <index; i++) {
			
			b[i]=a[i];
		}
		return b;
	}
	
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
				
				b[i] = a[i];
			}
			a=b;
			a[index++] = num;
			
		}
	}
	
	void print()
	{
		for (int i = 0; i <index; i++) {
			System.out.print(a[i]+" ");
		}
	}
	
}
