package Ooops;

public class Method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pattern.starpattern();
		Pattern.charpattern();
		Pattern.numpattern();
		
	}

}

class Pattern
{
	static void starpattern()
	{
		for (int i = 0; i<5; i++) 
		{
		
			for (int j = 0; j<5; j++)
			{
				if(j-i<=0)
				System.out.print("*");
				
			}
			System.out.println();
			}
					
	}
	
	static void charpattern()
	{
		for (int i = 0; i<5; i++) 
		{
		
			for (int j = 0; j<5; j++)
			{
				if(j-i<=0)
				System.out.print((char)(j+65));
			    
			}
			System.out.println();
		}
	}
	
	static void numpattern()
	{
		for (int i = 0; i<5; i++) 
		{
		
			for (int j = 0; j<5; j++)
			{
				if(j-i<=0)
				
				System.out.print(j+1);
				  
			}
			System.out.println();
		}
	} 
}
