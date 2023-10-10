package First;

public class HarshadNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num =999;
		int sum = 0;
		int temp = num;
		
		while(temp>0)
		{
			sum = sum+temp%10;
			temp = temp/10;
		
		}
		
		if(num%sum==0)
			System.out.println("Harshad number");
		else
			System.out.println("not harshad number");
	}
		
		
		
//		int num = 999;
//		int sum = 0;
//		
//		int temp = num;
//		
//		while(temp>0) {
//			
//			sum = sum+temp%10;
//			temp = temp/10;
//			
//		}
//		
//		if(num%sum==0)
//			System.out.println("yes");
//		else
//			System.out.println("no");
//			
//			
//			
//		}
	

}
