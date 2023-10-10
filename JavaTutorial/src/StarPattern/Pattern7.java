package StarPattern;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<8;i++) {
			for(int j=0;j<5;j++) {
				if(j-i>=0 ||j+i>=8)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
