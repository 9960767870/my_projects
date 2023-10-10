package Test;

public class Assignt7 {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5};
		
		int[] b = new int[a.length];
		
		for (int i = 0; i < b.length; i++) {
			b[i]=a[i];
		}
		
		System.out.println("after array");
		for (int i = 0; i < b.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("before array");
		for (int i = 0; i < b.length; i++) {
			System.out.print(a[i]+" ");
		}

	}

}
