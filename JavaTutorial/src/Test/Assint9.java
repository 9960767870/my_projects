package Test;

public class Assint9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3,4,5,6};
		
		int p = 0;
		int q = a.length-1;
		
		while(p<q)
		{
			a[p] = a[p]+a[q];
			a[q] = a[p]-a[q];
			a[p] = a[p]-a[q];
			
			p++;
			q--;
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
