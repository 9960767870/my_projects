package Array;

public class AvrageArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10,20,30,40,50};
		
		int sum = 0;
		
		double count = 0;
		
		for(int i=0;i<a.length;i++) {
			sum =sum+a[i];
			count++;
			
		}
		System.out.println(sum);
        System.out.println("Avarage is "+" "+sum/count);
	}

}
