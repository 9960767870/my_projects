package Array;

public class Assint9 
{
	public static int[] a = new int[5];
	
	public static int index=0;
	
	public static void push(int num)
	{
		if(index<a.length)
		{
			    a[index]=num;
			    index++;
		}
		
		else
		{
			System.out.println("stack is full");
		}
	}
	
	public static int pop()
	{
		if(index==0)
		{
			System.out.println("stack is empty");
			return 0;
		}
		else
		{
			index--;
			return a[index];
		}
	}
	
	public static void print()
	{
		for (int i = 0; i < a.length; i++) 
		{
		System.out.println(a[i]+" ");	
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
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

	}

}
