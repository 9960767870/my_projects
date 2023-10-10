package Practice2;

public class equallity {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6};
		int[] b = {1,2,3,4,5,6};
		int diffcount = 0;
		
		for (int i = 0; i < b.length; i++) {
			
			if(a[i]!=b[i])
			{
				diffcount++;
			}
		}
		if(diffcount==0)
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("different");
		}

	}

}
