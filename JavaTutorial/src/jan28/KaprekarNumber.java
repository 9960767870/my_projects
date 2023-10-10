package jan28;

public class KaprekarNumber {

	public static void main(String[] args) {
	
		int num = 99;
		int sq = num*num;
		
		int den = 0;
		int temp=num ;
		int count=0;
		while(temp>0)
		{
			temp = temp/10;
			count++;
		}
		den = (int) Math.pow(10, count);
		
		if(num<10)
			den=10;
		else if(num<100)
			den=100;
		else if(num<1000)
			den = 1000;
		else 
			den = 10000;
		
		int part1 = sq/den;
		int part2 = sq%den;
		
		int sum = part1+part2;
		
		if(num==sum)
			System.out.println("Kaprekar number");
		else
			System.out.println("not Kaprekar number");

	}

}
