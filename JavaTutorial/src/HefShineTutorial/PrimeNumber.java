package HefShineTutorial;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		if(isPrime(n)) {
			
			System.out.println(n+"Prime number is:");
		}
		else {
			System.out.println(n+"Not prime number is:");
		}
		
		

	}

	public static boolean isPrime(int n) {
		// TODO Auto-generated method stub
		
		if(n<=1) {
			
			return false;	
		}
		
		for(int i=2;i<Math.sqrt(n);i++) {
			   if (n % i == 0) {  
		}
		return false;
		
	}
		return true;
	}
}
