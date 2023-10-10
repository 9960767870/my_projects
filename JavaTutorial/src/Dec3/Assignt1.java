package Dec3;

public class Assignt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {6,5,4,3,2,1};
		
		int i =0;
		int j = a.length-1;
		
		
		while(j>i) {
			
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			 i++;
			 j--;
			 
		}
		
    for (int k = 0; k < a.length; k++) {
		System.out.println(a[k]+" ");
	}
	}

}
