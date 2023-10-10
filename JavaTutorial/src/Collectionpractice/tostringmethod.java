package Collectionpractice;

public class tostringmethod <t>
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
		
		t[] b = (t[]) new Object[size];
		
		for (int i = 0; i < a.length; i++) {
			
			            b[i]=a[i];
		}
		a=b;
		a[index++] = num;
	}
	}
	
	@Override
	public String toString() {
		
		String s = "[";
		
		for (int i = 0; i < index; i++) {
			
			s = s+a[i];
			
			if(i+1!=index)
			{
				s =s+",";
			}
		}
		s=s+"]";
		return s;
	}
	
	void print()
	{
		for (int i = 0; i < index; i++) {
			
			System.out.println(a[i]+" ");
		}
	}
	public static void main(String[] args) {
	
		tostringmethod<Integer> a = new tostringmethod<Integer>();
		
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		
		
		System.out.println(a);
		a.print();
	}

}
