package Array;

public class Diffmaxandmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {10,20,30,100,50,60};
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]>max)
			{
				 max=a[i];
			}
			
			if(a[i]<min)
			{
				     min=a[i];
			}
		}
		
		System.out.println(max);
		System.out.println(min);
		
		System.out.println(max-min);

	}

}
