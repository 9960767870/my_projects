package StarPattern;

public class Pattern11 {

	public static void main(String[] args) 
	{
       for (int i = 0; i <10; i++) 
       {
		for (int j = 0; j <6 ; j++) 
		{
		
			if((j==0 && i<=4)|| (i==0)||(i==4)||(j==5 && i>=4)||(i==9))
				System.out.print("*");
			else 
				System.out.print(" "); 
		}
		System.out.println();
	}	

	}

}
