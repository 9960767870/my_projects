package Test;

public class Assint8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1,2,3,1,2,4,5};
		
		int count = 0;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]==a[j])
				{
					count++;
					System.out.println(count);
					break;
					
					
				}
			}
		}
		System.out.println();
		if(count>0)
		{
			System.out.println(count);
		}
		
	}

}
