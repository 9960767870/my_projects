package Array;

public class EvenOddArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {11,22,33,44,55,66,77,88,99};
		
		int evencount=0;
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]%2==0)
			{
				evencount++;
			}
		}
		
		System.out.println("Evencount:"+evencount);
		
		System.out.println("oddcount:"+(a.length-evencount));
		
		int[] evenarray = new int[evencount];
		
		int[] oddarray = new int[a.length-evencount];
		
		
		int evenindex=0;
		int oddondex=0;
		for (int i = 0; i <a.length; i++) {
			
			if(a[i]%2==0)
			{
				       evenarray[evenindex++]=a[i];
			}
			else
			{
				       oddarray[oddondex++]=a[i];
			}
		}
		
		
		System.out.println("print even array");
		for (int i = 0; i < evenarray.length; i++) {
		  System.out.print(evenarray[i]+" ");	
		}
		
		System.out.println();
		System.out.println("print odd array");
		for (int i = 0; i < oddarray.length; i++) {
			System.out.print(oddarray[i]+" ");
		}
	}

}
