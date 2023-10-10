package BasicProgram;

public class Assint8 {

	public static void main(String[] args) {
	
		int num=123;
		int num2=0;
		int i=0;
//		while(num>0)
//		{
//			num2=num2*10+num%10;
//			num=num/10;
//		}
		
		loopi(num,num2);
		//System.out.println(num2);

	}

	private static void loopi(int num, int num2) {
		
		if(num>0)
		{
			num2=num2*10+num%10;
			num=num/10;
			loopi(num, num2);
		  return;
		
		}
		System.out.println(num2);
	}

}
