package Test;

public class Assint5 {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6};
		int num = 4;
		int index = Integer.MIN_VALUE;
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]==num)
			{
				 index=i;
			}
		}
		if(index==-1)
		{
			System.out.println("not found");
		}
		else
		{
			System.out.println("at index:"+index);
		}
	}
}
