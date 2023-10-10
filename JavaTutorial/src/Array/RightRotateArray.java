package Array;

public class RightRotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10,20,30,40,50};
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		int temp=a[a.length-1];

		for(int i=a.length-1;i>0;i--) {
			
			a[i]=a[i-1];
		}
		a[0]=temp;
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
	}

}
