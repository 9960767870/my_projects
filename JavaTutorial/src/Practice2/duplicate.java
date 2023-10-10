package Practice2;

public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1,2,3,4,2,1,5,6};
		
		int count = 0;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				
				if(a[i]==a[j])
				{
					count++;
				}
			}
			
		}
		System.out.println(count);
		
	}

}
