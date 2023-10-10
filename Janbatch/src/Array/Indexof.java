package Array;

public class Indexof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {11,22,33,44,55,66,77};
		
		int num = 77;
		//int index=-1;
		int count=0;
		
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]==num)
			{
				System.out.println("found at index:"+i);
				count++;
				 //index=i;
				break;
			}
			
		}
		
		if(count==0)
		{
			System.out.println("not found");
		}
	}

}
