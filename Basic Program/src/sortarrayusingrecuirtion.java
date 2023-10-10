import java.util.Arrays;

public class sortarrayusingrecuirtion
{
	static int[] a = {20,10,50,40,30};
	
	static int temp = 0;

	public static void main(String[] args) {
			
		loopi(0);
	
		System.out.println(Arrays.toString(a));

	}

	private static void loopi(int i) 
	{
		if(i<a.length)
		{
			loopj(i,i+1);
			loopi(i+1);
		}
			
	}
	private static void loopj(int i, int j) {
		
		if(j<a.length)
		{
			if(a[i]>a[j])
			{
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
			loopj(i, j+1);
		}
		
	}
}
