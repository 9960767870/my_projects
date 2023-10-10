package BasicProgram;

public class Assint10 {

	public static void main(String[] args) {
		
		int num = 7;
		int i=2;
		boolean isPrimeNumber=true;
		
//		for (int i = 2; i <num-1; i++) {
//			
//			if(num%i==0)
//				isPrimeNumber=false;
//		}
		if(isPrimeNumber==true)
			System.out.println("prime");
		else
			System.out.println("not");
		
		loopi(num,i);

	}

	private static void loopi(int num, int i) {
		
		boolean isPrimeNumber=true;
		if(i<num-1)
		{
			
			if(num%i==0)
				isPrimeNumber=false;
			loopi(num, i+1);
		}
		
	}

}
