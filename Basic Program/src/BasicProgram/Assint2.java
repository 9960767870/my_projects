package BasicProgram;

public class Assint2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 9;
		int sq = num*num;
		System.out.println(sq);
		int digitcount = 0;
		
		int temp = num;
		
		while(temp>0)
		{
			temp = temp/10;
			digitcount++;
		}
		
		int num2 = (int)Math.pow(10, digitcount);
		
		int part1 = sq%num2;
		int part2 = sq/num2;
		
		if(num==part1+part2)
		{
			System.out.println("kapreker number");
		}
		else
		{
			System.out.println("not");
		}
	}

}
