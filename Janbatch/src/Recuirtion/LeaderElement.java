package Recuirtion;

public class LeaderElement {

	public static void main(String[] args) {
		
		
		int[] a = {10,22,12,33,13,44};
	
	
		
		int i=0;
		loopi(i,a);

	}

	private static void loopi(int i, int[] a) {
		
		int count=0;
		if(i<a.length)
		{
			int j=i+1;
			count=loopj(a,i,j,count);
			
			if(count==0)
				System.out.println(a[i]);
			
			loopi(i+1, a);
		}
		
	}

	private static int loopj(int[] a, int i, int j, int count) {
		
		if(j<a.length)
		{
			if(a[i]<a[j])
			{
				count++;
			}
			return loopj(a, i, j+1, count);
		}
		else
			return count;
		
	}

	

}
