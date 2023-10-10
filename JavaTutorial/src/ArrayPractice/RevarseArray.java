package ArrayPractice;

public class RevarseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3,4,5};
		
		int i = 0;
		int j = a.length-1;
		
		while(j>i)
		{
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			
			i++;
			j--;
		}
		for (int j2 = 0; j2 < a.length; j2++) {
			System.out.println(a[j2]);
		}

	}

}
