package Set;

import java.util.Scanner;

public class Spynumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,product=1,lastdigit=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		while(num>0) {
			
			lastdigit = num%10;
			
			sum = sum + lastdigit;
			
			product = product*lastdigit;
			
			num = num/10;
			
		}
		
		if(sum==product) {
			System.out.println("Number is spy");
		}
		else {
			System.out.println("Number is not spy");
		}
		
		

	}

}
