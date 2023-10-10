package Practice2;

public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,4,5,3,2,6};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-1; j++) {
				
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
