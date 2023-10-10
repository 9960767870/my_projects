package First;

import java.util.Scanner;

public class FibonaciiSeries {
	static int a=0;
	static int b = 1;
	static int c ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int a = 0;
//		int b = 1;
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter the count(>2)");
//		int num = sc.nextInt();
//		
//		System.out.println(a);
//		System.out.println(b);
//		
//		int count = 2;
//		
//		while(count<=num-2) {
//			System.out.println(a+b);
//			
//			int temp = a+b;
//			a=b;
//			b=temp;
//			count++;
//		
//		int a = 0;
//		int b = 1;
//		System.out.println(a);
//		System.out.println(b);	
//		for(int i=0;i<10;i++) {
//			
//			int c = a+b;
//			b=a;
//		    a=c;
//		   System.out.println(a+b+" ");
//		}
		
		loopi(0);
		
		
	}

	private static void loopi(int i) {
		
		if(i<10)
		{
			 c = a+b;
			b=a;
			a=c;
			System.out.println(a+b+" ");
			loopi(i+1);
		}
			
		
	}
	

}
