package BasicProgram;

public class PrimeNumber {

	public static void main(String[] args) 
	{
				int num = 7;
		
		boolean isprimenumber = true;
		for (int i =2; i <num-1; i++) 
		{
			if(num%i==0)
				isprimenumber = false;
		}
		if(isprimenumber==true)
		{
			System.out.println("prime");
			
		}
		else
			System.out.println("even");
			
	}

}
