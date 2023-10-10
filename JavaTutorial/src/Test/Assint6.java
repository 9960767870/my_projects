package Test;

public class Assint6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {10,20,30,40,50,60};
		
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]>max)
			{
				 max=a[i];
			}
		}
		System.out.println(max);

	}

}
