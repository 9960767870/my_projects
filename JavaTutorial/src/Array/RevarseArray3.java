package Array;

public class RevarseArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {10,20,30,40,50};
		
		int i =0;
		int j=a.length-1;
		
		
		while(j>i) {
			a[i]=a[i]+a[j];
			a[j]=a[i]-a[j];
			a[i]=a[i]-a[j];
			i++;
			j--;
			
		}
		for(int k=0;k<a.length;k++) {
			System.out.println(a[k]);
		}
		

	}

}
