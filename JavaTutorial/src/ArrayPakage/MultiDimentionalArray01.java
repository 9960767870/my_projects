package ArrayPakage;

public class MultiDimentionalArray01 {

	public static void main(String[] args) {

		int[][] testArray = new int[4][2];
		testArray[0][0] = 10;
		testArray[0][1] = 10;
		testArray[1][0] = 60;
		testArray[1][1] = 70;
		testArray[2][0] = 10;
		testArray[2][1] = 10;
		testArray[3][0] = 10;
		testArray[3][1] = 10;

		for (int a = 0; a < testArray.length; a++) {
			for (int b = 0; b < testArray[a].length; b++) {
				
				System.out.print(testArray[a][b] + "\t");
			}
			System.out.println();
		}
	}
}
