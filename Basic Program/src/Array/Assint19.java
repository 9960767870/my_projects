package Array;

public class Assint19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {10,20,10,20,30,40,50};
		int count=0;
		
		for (int i = 0; i < a.length; i++) 
		{
		for (int j =i+1; j < a.length; j++) 
		{
		     if(a[i]==a[j])
		    	 count++;
			
		}	
		}
		
		int[] b = new int[a.length-count];
		int index=0;
		int counter=0;
		for (int i = 0; i < b.length; i++) 
		{
		 	
		 {
			         b[index++]=a[i];
		 }
		}
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

	}

}
