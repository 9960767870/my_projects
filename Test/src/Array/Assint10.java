package Array;

public class Assint10 {
	static int sum = 0;
	 static int num=100;
	public static void main(String[] args) 
	{
 
//	 while(i<=num)
//	 {
//		 sum = sum+i;
//		 i++;
//	 }
//	 for (int j = 1; j <=num; j++) {
//		
//		 sum = sum+j;
//	}
	 
	 loopi(0);
	 System.out.println(sum);

	}

	private static void loopi(int i) {
		
		if(i<=num)
		{
			sum = sum+i;
			loopi(i+1);	
		}		
	}

}
