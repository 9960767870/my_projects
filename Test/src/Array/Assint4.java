package Array;

public class Assint4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1};
		
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]==0)
			{
				a[i]=1;
			}
			
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]+" ");
		}

	}

}
