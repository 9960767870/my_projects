package Array;

public class Asignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10,20,30,60,40,50};
		
		int max = Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("maximum number is "+max);
		
		//secound maximun number
		
		int max2 = Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]!=max && a[i]>max2) {
				max2=a[i];
			}
		}
		System.out.println("secound maximum value is "+max2);

	}
	

}
