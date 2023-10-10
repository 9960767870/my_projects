package Recursion;

public class SameArray {
 
	static int[] a = {1,2,3};
	static int[] b = {1,2,3};
	
	static int i = 0;
	static int diffcount = 0;
	
	private static void check() {
		if(i<a.length)
		{
			if(a[i]!=b[i])
			{
			diffcount++;
			}
			i++;
			check();
		}
		
		
	}
	public static void main(String[] args) {
		
		if(a.length==b.length)
		{
			check();
			if(diffcount==0)
			{
				System.out.println("same");
			}
			else {
				System.out.println("not same");
			}
			
		}
		
		

	}

	

}
