package jan28;

public class HarshadNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=10;
		int sum=0;
		int temp = num;
		
		while(temp>0)
		{
			sum = sum+temp%10;
			temp = temp/10;
		}
		
		if(num%sum==0)
			System.out.println("Harshad");
		else
			System.out.println("not");

	}

}
