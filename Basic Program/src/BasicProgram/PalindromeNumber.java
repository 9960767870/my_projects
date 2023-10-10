package BasicProgram;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 124;
		int num2 = 0;
		
		while(num>0)
		{
			num2 = num2*10+num%10;
			num = num/10;
		}
		System.out.println(num2);
	}

}
