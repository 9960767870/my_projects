
public class Dimentional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a = {
			        {1,2,3,4,5,6},
			      	{7,8,9,10,11,12},
			      	{13,14,15,16,17,18},
			      	{19,20,21,22,23,24}
		};
		int count=0;
		for (int i = 0; i < a.length; i++) 
		{
		for (int j = 0; j < a[0].length; j++) {
			
			if(a[0]==a[i])
			{
				
				count++;
				System.out.print(a[i][j]+" ");
				
			}
			if(a[3]==a[i])
			{
				System.out.print(a[i][j]+" ");
				count++;
			}		
		}
		System.out.println();
		}
		System.out.println();
		System.out.println(count);
		            

	}

}
