package StarPattern;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<7;i++) {
			for(int j=0;j<7;j++) {
				if(j-i>=0)
					System.out.print(j+1);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
