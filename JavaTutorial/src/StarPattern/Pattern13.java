package StarPattern;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 1;
		for (int i = 0; i < 5; i++) 
		{
			
		for (int j = 0; j <6; j++) 
		{
			if(j-i<=0)
				System.out.print(count++ +" ");
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
		}

	}

}
