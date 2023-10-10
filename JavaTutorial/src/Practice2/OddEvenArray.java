package Practice2;

public class OddEvenArray {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		
		int count = 0;
		
		for (int i = 0; i < a.length; i++) {
	
		if(a[i]%2==0)
		{
	         count++;		
		}
		}
		
	    int[] EvenArray = new int[count];
	    int[] OddArray = new int[a.length-count];
	    
	    int evenindex = 0;
	    int oddindex = 0;
	    
	    for (int i = 0; i <a.length; i++) {
			
	    	if(a[i]%2==0)
	    	{
	    		EvenArray[evenindex++]=a[i];
	    	}
	    	else
	    	{
	    		 OddArray[oddindex++]=a[i];
	    	}
		}
	    
	    System.out.println("EvenArray");
	    for (int i = 0; i < EvenArray.length; i++) {
			System.out.print(EvenArray[i]+" ");
		}
	    System.out.println();
	    System.out.println();
	    System.out.println("OddArray");
	    for (int i = 0; i < OddArray.length; i++) {
			System.out.print(OddArray[i]+" ");
		}
	}

}
