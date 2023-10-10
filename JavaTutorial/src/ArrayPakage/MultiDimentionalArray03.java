  package ArrayPakage;

public class MultiDimentionalArray03 {
	public static void main(String[] args) {
		
		int[][] testOne= {
				              
				               {1,3,5},
				               {7,9,11},
				               {13,15,19},
		                  };
		
		int[][] testTwo= {
				              
				               {2,4,6},
				               {6,8,10},
				               {12,14,18},
		                    
		                   };
		
		int[][] resultArray=new int[3][3];
		
		for(int a=0;a<testOne.length;a++) {
		
		for(int k=0;k<testOne.length;k++) {
			
		resultArray[a][k] = testOne[a][k] + testTwo[a][k] ;
		
		System.out.print(resultArray[a][k]+ "\t");
		}
		
		System.out.println();
			
			
		}
		}
		
	}


