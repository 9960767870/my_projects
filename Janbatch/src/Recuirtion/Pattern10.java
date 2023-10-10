package Recuirtion;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		int i=0;
		loopi(i);

	}

	private static void loopi(int i) {
	
		if(i<9)
		{
			int j=0;
			loopj(i,j);
			System.out.println();
			loopi(i+1);
		}
	}

	private static void loopj(int i, int j) {
		// TODO Auto-generated method stub
		if(j<9)
		{
			if(j+i>=8 && j-i<=0)
				System.out.print("*");
			else
				System.out.print(" ");
			
			loopj(i, j+1);
		}
		
	}

}
