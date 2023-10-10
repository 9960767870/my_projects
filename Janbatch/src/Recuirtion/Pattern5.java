package Recuirtion;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				
				if(j+i<=4 || j-i<=-4)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
		
		int i=0;
		loopi(i);
	}

	private static void loopi(int i) {
		// TODO Auto-generated method stub
		int j=0;
		if(i<9)
		{
			loopj(i,j);
			System.out.println();
			loopi(i+1);
		}
	}

	private static void loopj(int i, int j) {
		// TODO Auto-generated method stub
		
		if(j<5)
		{
			if(j+i<=4 || j-i<=-4)
			{
			System.out.print("*");
			}
			System.out.print("");
			loopj(i, j+1);
		}
	}

}
