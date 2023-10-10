package BasicProgram;

public class binerysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {1,2,3,4,5,6,7};
		int start=0;
		int end=a.length-1;
		int num=7;
		while(true)
		{
			int mid=(start+end)/2;
			if(a[mid]==num)
			{
				System.out.println("element found"+mid);
				break;
			}
			else if(num>a[mid])
			{
				start=mid+1;
			}
			else
			{
				end=mid-1;
			}
			
			if(start>end)
			{
				System.out.println("wlwmwnt not found");
				break;
			}
		}
	}

}
