package Array;

public class UniquePairsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,1,2};
		 
		for (int i= 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
//				for (int k =j+ 1; k < a.length; k++) {
					
					
					System.out.println(a[i]+" "+a[j]);
				}
			}
		}

	}

 
