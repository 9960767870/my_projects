package ArrayPractice;

public class Secondmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {10,20,90,50,40,70};
		
		int max = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max)
			{
				max=a[i];
			}
	
		}
		
		for (int i = 0; i < a.length; i++) {
			
	       if(a[i]!=max && a[i]>max2)
	       {
	    	           max2=a[i];
	       }
		}
		System.out.println(max2);

	}

}
