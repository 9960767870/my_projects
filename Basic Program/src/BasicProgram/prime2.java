package BasicProgram;

import java.util.Scanner;

public class prime2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your number");
	
	int num = sc.nextInt();
	
	boolean isPrimeNumber=true;
	for (int i = 2; i <num-1; i++) {
		
		if(num%i==0)
		isPrimeNumber=false;
	}
	if(isPrimeNumber==true)
		System.out.println("prime number");
	else
		System.out.println("not prime number");

	}

}
