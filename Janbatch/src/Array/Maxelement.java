package Array;

public class Maxelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {10,20,100,30,200,40};
		
		int max = Integer.MIN_VALUE;
		int maxcount=0;
		
		for (int i = 0; i <a.length; i++) {
			
			if(a[i]>max)
			{
				   max = a[i];
				   maxcount=i;
				  	   
			}
		
		}
		
		System.out.println(max);
		System.out.println(maxcount);

	}

}
