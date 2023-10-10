package Set;

public class DemoString {
	
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
         
         int[][] test = new int[3][3];
         for(int i=0;i<testOne.length;i++) {
        	 for(int j=0;j<testTwo.length;j++) {
        	test[i][j] = testOne[i][j]+testTwo[i][j];
        	
        	System.out.print(test[i][j]+"\t");	 
        	
        	
        	
//        		 System.out.print(testOne[i][j]+"\t");
//       		 System.out.print(testTwo[i][j]+"\t");
        	 }
        	 
        	System.out.println();
         }
		
		 
		
			 }
		 }
		



