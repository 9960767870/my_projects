package Array;

public class Assint9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {10,20,30,40,60,70,80,90};
		
		int num=80;
	   int	start=0;
		int end = a.length-1;
		
		while(true)
		{
			int mid = (start+end)/2;
			
			if(a[mid]==num)
			{
				System.out.println("at the mid is:"+mid);
				break;
			}
			
			else if(a[mid]<num)
			{
				start=mid+1;
			}
			else
			{
				end = mid-1;
			}
			if(end<start)
			{
				System.out.println("not found");
			break;
			}
		}
		
	}

}
