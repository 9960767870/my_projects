package Array;

import java.util.Scanner;

public class Assint7 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		
		for (int i = 0; i < 10; i++) {
			
			int num = sc.nextInt();
		
		
		if(num<0)
		{
			if(num%2==0)
			{
				System.out.println("nagative number && even:"+num);
			}
			else
				System.out.println("nagative number: && odd"+num);
		}
		if(num>0)
		{
			if(num%2==0)
			{
				System.out.println("possitive && even number:"+num);
			}
			else
				System.out.println("possitive && odd number:"+num);
		}

		}
	}

}
