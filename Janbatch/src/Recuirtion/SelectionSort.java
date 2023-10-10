package Recuirtion;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {20,10,50,40,30};
		
		int i=0;
		loopi(a,i);
		print(i,a);
	}

	private static void print(int i, int[] a) {
		// TODO Auto-generated method stub
		if(i<a.length)
		{
			System.out.println(a[i]);
			print(i+1, a);
		}
		
	}

	private static void loopi(int[] a, int i) {
		
		if(i<a.length)
		{
			int j=i+1;
			
			int min=i;
			
			min=loopj(a,i,j,min);
			
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
			
			
			
			loopi(a, i+1);
		}
		
	}

	private static int loopj(int[] a, int i, int j,int min) {
	
		if(j<a.length)
		{
		  if(a[j]<a[min])
		  {
			  min=j;
			  
		  }
		 return  loopj(a, i, j+1, min);
		}
		else
		return min;
		
	}

}
