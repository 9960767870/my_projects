package Array;

public class count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {10,20,30,11,33,21,25,-40,-50,60,70,80,-90};
		
		int evencount=0,oddcount=0,positivecount=0,nigative=0;
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]%2==0)
			{
				evencount++;
			}
			else
			{
				oddcount++;
			}
			
			
			if(a[i]<0)
			{
				nigative++;
			}
			else
			{
				positivecount++;
			}
			   
		}
		
		
		System.out.println("evennumber:"+evencount);
		
		System.out.println("oddcount:"+oddcount);
		
		System.out.println("positivecount:"+positivecount);

		System.out.println("nigativecount:"+nigative);

	}

}
