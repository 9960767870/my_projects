package Array;

public class ReverseArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10,20,30,40,50};
		
  	int i =0;
		int j=a.length-1;
		
		while(j>i) {
			
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
		
		for(int k=0;k<a.length;k++) {
			System.out.println(a[k]);
		}
		
//		for(int i = 0;i<a.length;i++) {
//			for(int j=a.length-1; j>=0;j--) {
//				
//				
//				int temp = a[i];
//				a[i] = a[j];
//				a[j] = temp;
//				 
//			}
//			
//		
//			
//		}
//
//		for(int k=0;k<a.length;k++) {
//			System.out.println(a[k]);
//		}
	}

}
