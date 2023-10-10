package Practice2;

public class avarage {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6};
		int sum=0;
		int avg = 0;
		
		double count = 0;
		for (int i = 0; i < a.length; i++) {
			
			sum = sum+a[i];
			count++;
			
		}
		System.out.println("Array of sum is:"+sum);
		System.out.println("Array of avarage is:"+sum/count);

	}

}
