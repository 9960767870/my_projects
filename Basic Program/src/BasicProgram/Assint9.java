package BasicProgram;

public class Assint9 {

	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int i=0;
//		for (int k = 0; k <10; k++) {
//			
//			int c=a+b;
//			b=a;
//			a=c;
//			System.out.println(a+b);
//		}
		
		loopi(a,b,i);

	}
	
	public static void loopi(int a,int b,int i)
	{
		if(i<10)
		{
		int c=a+b;
		b=a;
		a=c;
		System.out.println(a+b);
		loopi(a, b, i+1);
		}
	}

}
