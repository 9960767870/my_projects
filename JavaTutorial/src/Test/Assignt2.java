package Test;

public class Assignt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {10,20,-10,30,-40,50};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
				}
			}
			for (int j2 = 0; j2 < a.length; j2++) {
				System.out.println(a[j2]+" ");
			}
		
		
	}
}


