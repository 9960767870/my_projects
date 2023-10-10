package StarPattern;

public class Pattern29 {

	public static void main(String[] args) {

		for (int i = 0; i <11; i=i+2) 
		{
		for (int j = 0; j < 11; j++) 
		{
			if(j-i<=0)
			{
				if(i==j*2)
				{
					System.out.print(" ");
				}
				
				else
				{
					System.out.print("*");
				}
			
		}	
		}
		System.out.println();

	}

}
}
