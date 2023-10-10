package Test;

public class Assignt {

	public static void main(String[] args) {
		
		int[] a = {10,30,40,20,50,8};
		int min = 0;
		for (int i = 0; i < a.length; i++) {
			   min=i;
			for (int j = i+1; j < a.length; j++) {
				
				if(a[j]<a[min]) {
					
					min=j;
				}
				
			}
			    int temp = a[i];
			    a[i] = a[min];
			    a[min] = temp;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]+" ");
		}
		

	}

}
