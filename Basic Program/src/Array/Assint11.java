package Array;

public class Assint11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {10,20,30,40,50};
		
		int index = Integer.MIN_VALUE;
		
		int num = 20;
		
		for (int i = 0; i < a.length; i++) 
		{
		
			if(a[i]==num)
				index=i;
				
		}
		if(index==-1)
		{
			System.out.println("not found");
		}
		else
		{
			System.out.println("found at index:"+index);
		}

	}

}
