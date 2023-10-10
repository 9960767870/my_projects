package StarPattern;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i <7; i++) 
		{
		for (int j = 0; j <4; j++) 
		{
		
			if(j==0)
				System.out.print("*");
			
			else if(i==0 )
				System.out.print("*");
			else if(i==3)
				System.out.print("*");
			else if(j==3 && i<=3 )
				System.out.print("*");
			else if(j==1 && i==4 )
				System.out.print("*");
			else if(j==2 && i==5)
				System.out.print("*");
			else if(j==3 && i==6)
				System.out.print("*");
			else 
				System.out.print(" ");
			
		}
		System.out.println();
		}

	}

}
