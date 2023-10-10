package Dec3;

public class Assignt3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {12,22,14,13,15,10};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]>a[j]) {
					
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]+" ");
		}

	}

}
