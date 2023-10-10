package Array;

public class Assint2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {10,20,30,40,-50,-60,70,80,-90};
		
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]<0)
			{
				a[i]=0;
			}
			System.out.println(a[i]);
		}

	}

}
