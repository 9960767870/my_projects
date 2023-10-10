
public class Febonaciiserice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 0;
		int b = 1;
		
		for (int i = 0; i <10; i++) 
		{
		
			int c = a+b;
			b=a;
			a=c;
			System.out.println(a+b+" ");	
		}
		
		

	}

}
