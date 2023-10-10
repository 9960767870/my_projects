package Recuirtion;

public class SortArray {

	public static void main(String[] args) {
		
		int [] a= {40,10,20,30,60,50};
		
		int i=0;
		loopi(a,i);
		print(a,i);

	}



	private static void loopi(int[] a, int i) {
		
		if(i<a.length)
		{ 
			int j=i+1;
			
			loopj(a,i,j);
			
			loopi(a, i+1);
				
		}
		
	}

	private static void loopj(int[] a, int i, int j) {
		
		if(j<a.length)
		{
			if(a[i]>a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			loopj(a, i, j+1);
		}
		
	}
	private static void print(int[] a, int i) {
		
		if(i<a.length)
		{
			System.out.println(a[i]);
			print(a, i+1);
		}
		
	}
	

}
