package Array;

public class SortedArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {60,20,40,30,10,50};
		
		//Selection Sort;
		
		for(int i=0;i<a.length;i++) {
			int min=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					min=j;
			
			int temp=a[i];
			a[i]=a[min]; 
			a[min]=temp;
		}
		}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		}
}
	


