package Dec3;

public class Assignt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {6,5,4,3,2,1};
		
		int i = 0;
		int j = a.length-1;
		
		while(j>i) {
			
			a[i] = a[i]+a[j];
			a[j] = a[i]-a[j];
			a[i] = a[i]-a[j];
			i++;
			j--;
		}
		for (int j2 = 0; j2 < a.length; j2++) {
			System.out.println(a[j2]+" ");
		}

	}

}
