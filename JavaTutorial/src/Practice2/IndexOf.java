package Practice2;

public class IndexOf {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6};
		
		int num = 4;
		int index = -1;
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]==num)
			{
				index=i;
				System.out.println("index at:"+index);
			}
			
		}
		if(index==-1)
		{
			System.out.println(-1);
		}

	}

}
