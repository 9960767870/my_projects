package JavaTutorialForBegeningCodeWithHarry;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] flats = new int [2][3];
		
		flats[0][0] = 100;
		flats[0][1] = 200;
		flats[0][2] = 300;
		flats[1][0] = 400;
		flats[1][1] = 500; 
		flats[1][2] = 600;
		
		for(int a=0;a<flats.length;a++) {
		for(int b=0;b<flats[a].length;b++) {
			
			System.out.print(flats[a] [b]);
		
            System.out.print(" ");
		}
            System.out.println("");		
		}

	}
}


