package Recuirtion;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a = {11,22,33,44,55,66,77,88};
		
		int num=77;
		int min=0;
		int max=a.length-1;
		int index=-1;
		
		
		index=binarySearch(a,num,min,max,index);
		
		if(index==-1)
			System.out.println("not found");
		else
			System.out.println("found at index :"+index);
	}

	private static int binarySearch(int[] a, int num, int min, int max, int index) {
	
		if(max>min)
		{
			int mid=(min+max)/2;
			
			if(a[mid]==num)
			{
				index=mid;
				return index;
			}
			else if(a[mid]<num)
				min=mid+1;
			else
				max=mid-1;
			
			
			return binarySearch(a, num, min, max, index);
		}
		else
			return index;
		
	}

}
