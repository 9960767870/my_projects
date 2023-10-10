package Recuirtion;

public class Pattern1 {

	public static void main(String[] args) {
		
		int i=0;
		
		loopi(i);

	}

	private static void loopi(int i) {
		
		int j=0;
		if(i<5)
		{
			loopj(i,j);
			System.out.println();
			loopi(i+1);
		}
		
	}

	private static void loopj(int i,int j) {
	
		if(j<5)
		{
			if(j-i<=0)
			{
				System.out.print("*");
			}
			System.out.print("");
			loopj(i, j+1);
		}
		
	}

}
