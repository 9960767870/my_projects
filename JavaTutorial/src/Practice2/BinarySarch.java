package Practice2;

public class BinarySarch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3,4,5,6,7,8,9};
		
		int num = 8;
		int start = 0;
		int end = a.length-1;
		
		while(true)
		{
			int mid = (start+end)/2;
			
			if(a[mid]==num)
			{
				System.out.println("index of mid is:"+mid);
				break;
			}
			
			if(num>a[mid])
			{
				start = mid+1;
			}
			else
			{
				end = mid-1;
			}
			
			if(start>end)
			{
				System.out.println("not found");
			}
		}

	}

}
