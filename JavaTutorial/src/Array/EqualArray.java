package Array;

public class EqualArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {11,22,33,44};
		int[] b = {11,22,33,44};
		 
		if(a.length==b.length) {
			
			int diffCount=0;
//			for(int i=0;i<a.length;i++) {
//				 
//				if(a[i]!=b[i]) {
//					diffCount++;
//					break;
//				}
//			}
			
			looi(0,a,b,diffCount);
			if(diffCount==0) {
				System.out.println("Array is Same");
			}
			else {
				System.out.println("Array is Different");
			}
			
		}

	}

	private static void looi(int i, int[] a, int[] b, int diffCount) {
		// TODO Auto-generated method stub
	
		if(i<a.length)
		{
			if(a[i]!=b[i])
			{
				diffCount++;
				
				looi(i+1, a, b, diffCount);
			}
				
		}
	}

}
