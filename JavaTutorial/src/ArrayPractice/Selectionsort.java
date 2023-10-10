package ArrayPractice;

public class Selectionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {30,20,10,40,50};
		int min = 0;
		for (int i = 0; i < a.length; i++) {
			 min=i;
			for (int j = i+1; j < a.length; j++) {
			
				if(a[j]<a[min])
				{
					min=j;
				}
			}
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
