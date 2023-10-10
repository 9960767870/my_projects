package Recuirtion;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int i=0;
		loopi(i);

	}

	private static void loopi(int i) {
		// TODO Auto-generated method stub
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
		if(j<5)
		{
			if(j+i>=4 && j-i>=-4)
				System.out.print("*");
			else
				System.out.print(" ");
			loopj(i, j+1);
		}
		
	}

}
