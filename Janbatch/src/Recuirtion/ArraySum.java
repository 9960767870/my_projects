package Recuirtion;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {11,22,33,44};
		
		int i=0;
		int sum=0;
		
		sum=print(a,i,sum);
		System.out.println(sum);

	}

	private static int print(int[] a, int i, int sum) {
		
		if(i<a.length)
		{
		sum=sum+a[i];
		return print(a, i+1, sum);
		}
		else
			return sum;
		
	}

}
