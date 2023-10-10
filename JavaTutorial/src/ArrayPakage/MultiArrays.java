package ArrayPakage;

public class MultiArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		int[][] arr = new int[3][3];
		
		  arr[0][0] = 11;
		  arr[0][1] = 22;
		  arr[0][2] = 33;
		  arr[1][0] = 54;
		  arr[1][1] = 26;
		  arr[1][2] = 222;
		  arr[2][0] = 23;
		  arr[2][1] = 22;
		  arr[2][2] = 22;
		 
		 
		  for(int i=0;i<arr.length;i++) {
			  for(int j=0;j < arr.length;j++) {
				  System.out.print(arr[i][j]+"\t");
			  }
			  System.out.println();
			  
		  }
		  
		
}
}
