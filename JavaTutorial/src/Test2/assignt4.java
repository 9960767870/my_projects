package Test2;

public class assignt4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10,20,30,40,50};
		
		int temp = a[0];
		for (int i = 0; i < a.length-1; i++) {
			a[i]=a[i+1];
		}
		     a[a.length-1]=temp;
             for (int i = 0; i < a.length; i++) {
				System.out.println(a[i]);
			}
	}
        

}
