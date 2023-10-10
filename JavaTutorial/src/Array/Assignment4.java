package Array;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] a = {"Rushi","sachin","varad"};
		String[] b = new String[a.length];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		
		System.out.println("After array");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println();
		System.out.println("before array");
		for(int j=0;j<a.length;j++) {
			System.out.print(b[j]+" ");
		}
	}

}
