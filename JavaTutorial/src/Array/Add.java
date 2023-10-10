package Array;

public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {10,20,30,40};
		int sum = 0;
//		sum = sum+a[0];
//		sum = sum+a[1];
//		sum = sum+a[2];
//		sum = sum+a[3];
		
		for(int i=0;i<a.length;i++) {
			 sum = sum+a[i];
		}
		System.out.println(sum);

	}

}
