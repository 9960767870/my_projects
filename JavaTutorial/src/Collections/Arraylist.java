package Collections;

public class Arraylist 
{

	private int[] a = new int[5];
	
	private int index = 0;
	
	void add(int num)
	{
		if(index<a.length)
		{
			a[index++]=num;
		}
		else
		{
			//System.out.println("i am else");
			
			int size =  (int) (1.5*a.length);
			int[] b = new int[size];
			
			for (int i = 0; i < a.length; i++) 
			{
			     b[i] = a[i];	
				
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
	public static void main(String[] args) {
		
		Arraylist a = new Arraylist();
		
		for (int i = 0; i < 100; i++) {
			
			a.add(10);
			a.print(); 
			
		}
		

	}

}
