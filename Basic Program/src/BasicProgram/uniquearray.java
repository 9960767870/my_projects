package BasicProgram;

public class uniquearray {

	public static void main(String[] args)
	{
	
		int[] a = {1,2,3,4,1,2,3,4};
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j]) {
					
					count++;
					break;
				}
			}
			
		}
			int[] b = new int[a.length-count];
			int index = 0;
				
				int counter=0;
			for (int j = 0; j < b.length; j++) {
				
			if(counter==0) {
				b[index]=a[j];
				index++;
			}
			}
			
			for (int j = 0; j < b.length; j++) {
				System.out.println(b[j]);
			}

	}

}
