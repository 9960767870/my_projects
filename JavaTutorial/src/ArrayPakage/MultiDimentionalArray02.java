package ArrayPakage;

public class MultiDimentionalArray02 {

	public static void main(String[] args) {
		
		int[][] testArray= {                                //array Declaration And Definition
				              {1,2,3},
				              {4,5,6},
				              {7,8,9},
				              
		                 };
		
		for(int i=0;i<testArray.length;i++) {             //outer for loop for rows
		
		for(int k=0;k<testArray.length;k++) {             //inner for loop for columns
			
		System.out.print(testArray[i][k]+"\t");
		}
		
		System.out.println();
		}
		}
}
	


