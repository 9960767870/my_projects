package Test2;

public class Assignt5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {10,20,30,40};
		
		int temp = a[a.length-1];
		for (int i = a.length-1; i >0; i--) {
			a[i]=a[i-1];
		}
		          a[0]=temp;

		          for (int i = 0; i < a.length; i++) {
					System.out.println(a[i]);
				}
	}

}
