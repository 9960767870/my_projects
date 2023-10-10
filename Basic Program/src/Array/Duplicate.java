package Array;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		int[] a = {10,20,10,30,40,20,50};
		
		int count=0;
		
		String s ="";
		for (int i = 0; i < a.length; i++) 
		{
			int cont=0;
		for (int j =i+1; j < a.length; j++) 
		{
		
			if(a[i]==a[j])
			{
				count++;
				cont++;
				System.out.println(a[j]);
				
				//s = s+a[i];
				break;
				
			}
			
		}
		if(cont==0)
		{
			System.out.print(a[i]+" ");
		}
		}
//		
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
	}

}
