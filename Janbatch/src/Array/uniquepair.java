package Array;

public class uniquepair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {11,22,33,44,55};
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i+1; j < a.length; j++) {
				
				System.out.println(a[i]+" "+a[j]);
			}
		}
	}

}
