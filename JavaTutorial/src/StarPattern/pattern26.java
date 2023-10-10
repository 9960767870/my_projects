package StarPattern;

public class pattern26 {

	public static void main(String[] args) {
	
		//int count =1;
		for (int i = 0; i <5; i++) 
		{
			
		for (int j = 0; j <5; j++) 
		{
		
			if(j+i>=4)
				System.out.print("* ");
			else 
				System.out.print(" ");
		}
		System.out.println();
		}

	}

}
