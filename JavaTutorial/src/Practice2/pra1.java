package Practice2;

public class pra1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		int[] a = {1,2,3,2,4,1,5,6};
		
		
		int diffcount = 0;
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]==a[j])
				{
					diffcount++;
				}
			}
		}
		
		int[] b= new int[a.length-diffcount];
		
		int index=0;
		
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 0; j < b.length; j++) {
				
				if(a[i]==b[j]);
				{
				count++;	
				}
			}
			if(count==0)
			{
				b[index++]=a[i];
			}
		}
		System.out.println(diffcount);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
 		
	}

}
