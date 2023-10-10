
public class specificnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10,20,30,40,50,60};
		
		int num = 60;
		int count=0;
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]==num)
			{
				count++;
			}
				
		}
		
		int[] b = new int[a.length-count];
		
		int index=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]!=num)
			{
				 b[index++]=a[i];
			}
			
		}
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]+" ");
		}

	}

}
