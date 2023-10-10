package Array;

public class TwoArrayAddThardArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3,4,5};
		int[] b = {6,7,8,9};
		
		int[] c = new int[a.length+b.length];
		
		int index = 0;
		int bindex = 0;
		for (int i = 0; i < c.length; i++) {
			
			if(i<a.length) {
				c[i]=a[index++];
			 
			}
			else {
			c[i]=b[bindex++];
			}
			
		}
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]+" ");
		}

	}

}
