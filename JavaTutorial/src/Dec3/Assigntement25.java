package Dec3;

public class Assigntement25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {3,7,90,20,5,50,40};
		
		int k = 3;
		double min = Integer.MAX_VALUE;
		
		for (int i = 0; i < a.length-2; i++)
		{
			int sum = 0;
			for (int j = i; j < i+k; j++)
			{
				sum = sum+a[j];
			}
			double avg = (sum*1.0)/k;
			if(avg<min) {
				min = avg;
			}
		}
		System.out.println(min);
 
	}

}
