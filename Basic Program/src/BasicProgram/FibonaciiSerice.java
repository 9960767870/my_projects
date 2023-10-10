package BasicProgram;

public class FibonaciiSerice {

	public static void main(String[] args) 
	{
		int a  =0;
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		
		for (int i = 0; i < 10; i++) { 
			
			int c = a+b;
			b=a;
			a=c;
			System.out.println(a+b+" ");
		}
		
	}

}
