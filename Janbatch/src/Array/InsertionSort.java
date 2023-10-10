package Array;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {20,10,40,30,50} ;
		
		for (int i = 0; i < a.length; i++) {
			
			int j=i;
			
			while(j>=0)
			{
				if(a[j]<a[i])
					break;
				j--;
			}
			int temp=a[i];
			for (int k = i;k>=j+2; k--) {
				a[k]=a[k-1];
			}
			
			a[j+1]=temp;
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
