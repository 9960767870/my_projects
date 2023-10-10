package Array;

public class MaxValueMinValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {10,20,30,5,50,100,60};
		
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		int min = Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println(max-min );
		

	}

}
