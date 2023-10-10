package Recuirtion;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		int[] a = {1,2,1,3,4,5,6,5,6};
		
	int diffcount=0;

	diffcount=loopi(a,0,diffcount);
	
	
	int[] b = new int[a.length-diffcount];
	int bindex=0;
	
	bloopi(a,0,b,bindex);

	print(0,b);
	
		
		
	}


	private static int loopi(int[] a,int i, int diffcount) {
		
		if(i<a.length)
		{
			int j=i+1;
		diffcount=loopj(a,i,j,diffcount);
		
			return loopi(a, i+1, diffcount);
		}
		else
		     return diffcount;
		
	}

	private static int loopj(int[] a, int i, int j, int diffcount) {
		
		if(j<a.length)
		{
			if(a[i]==a[j])
			{
				diffcount++;
				return diffcount;
			}
			return loopj(a, i, j+1, diffcount);
		}
		else
			
		return diffcount;
		
	}
	
private static void bloopi(int[] a, int i, int[] b, int bindex) {
	
	if(i<a.length)
	{
		int count=0;
		
		count=bloopj(a,i,b,0,count);
		
		if(count==0)
			b[bindex++]=a[i];
		
		bloopi(a, i+1, b, bindex);
	}
		
	}



private static int bloopj(int[] a, int i, int[] b, int j, int count) {
	
	if(j<b.length)
	{
		if(a[i]==b[j])
		
			count++;
			
		return bloopj(a, i, b, j+1, count);
		
	}
	return count;
}


private static void print(int i, int[] b) {
	if(i<b.length)
	{
		System.out.println(b[i]);
		
		print(i+1, b);
	}
	
}

	

}
