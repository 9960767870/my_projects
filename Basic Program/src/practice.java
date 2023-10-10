
public class practice {

	static int a=0;
	static int b=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
//		for (int i = 0; i < 10; i++) {
//			
//			int temp = a+b;
//			b=a;
//			a=temp;
//			System.out.println(a+b);
			
			loopi(0);
		
		}
	private static void loopi(int i) {
		// TODO Auto-generated method stub
		
		if(i<10)
		{
			int temp=a+b;
			b=a;
			a=temp;
			
			System.out.println(a+b);
			loopi(i+1);	
		}
		
	}
	}
	
	


