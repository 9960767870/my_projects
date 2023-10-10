package ArrayPakage;

public class MultiDimetionalArray3D {
	
	public static void main(String[] args) {
		
		int[][][] testArray=new int[2][2][2];
		
		testArray[0][0][0]=10;
		testArray[0][0][1]=20;
		testArray[0][1][0]=30;
		testArray[0][1][1]=40;
		testArray[1][0][0]=50;
		testArray[1][0][1]=60;
		testArray[1][1][0]=70;
		testArray[1][1][1]=80;
		
		for(int a=0;a<testArray.length;a++) {
		
		for(int b=0;b<testArray[a].length;b++) {
			
		for(int c=0;c<testArray[a][b].length;c++) {
			
			System.out.print(testArray[a][b][c]+"\t");
			
		}
		
		System.out.println();
		}
		}
		}
		
	}


