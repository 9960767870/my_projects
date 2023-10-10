package Test3;

public class Assignt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {10,15,13,14,12}; 
		
		for (int i = 0; i < a.length; i++) {
		int	min=i;
			for (int j = i+1; j < a.length; j++) {
				min=j;
				if(a[min]<a[i]) {
					
					int temp = a[i];
					a[i] = a[min];
					a[min] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
