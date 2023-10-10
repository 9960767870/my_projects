package BasicProgram;

public class PellNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 0;
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		
		int count = 1;
		
		while(count<10)
		{
			System.out.println(a+2*b);
			
			int temp = a+2*b;
			a=b;
			b=temp;
			count++;
		}

	}

}
