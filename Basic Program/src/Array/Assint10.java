package Array;

public class Assint10 
{

	public static int[] a = new int[5];
	public static int index = 0;
	
	public static void push(int num)
	{
		if(index<a.length)
		{
			a[index++]=num;
		}
		else
		{
			System.out.println("queue is full");
		}
	}
	
	public static int pop()
	{
		if(index==0)
		{
			System.out.println("queue is empty");
			return 0;
		}
		else
		{
			int temp = a[0];
			
			for (int i = 1; i < a.length; i++) 
			{
			
				     a[i-1]=a[i];
			}
			     index--;
			     return temp;
		}
	}
	
	static void print()
	{
		for (int i = 0; i < a.length; i++) 
		{
		System.out.println(a[i]+" ");	
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
		push(10);
		push(20);
		push(30);
		push(40);
		push(50);
		print();
		
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		//System.out.println(pop());
		

	}

}
