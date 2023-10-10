package Array;

public class CopyArray {

	static int[] a = {10,20,30,40,50};
	
	static int[] b = new int[a.length];
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		for(int i = 0;i<a.length;i++) {
			
			b[i]=a[i];
			
			
		}
		
		System.out.println("After array");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		System.out.println("before array");
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
			
			
			
		}
	}

}


