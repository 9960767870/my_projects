package Practice2;

public class duplicatearray {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,2,4,3,5,6};
		
		int count = 0;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]==a[j])
				{
					count++;
					break;
				}
			}
		}
		int[] b = new int[a.length-count];
		int index = 0;
		
		for (int i = 0; i < a.length; i++) {
			int count1 = 0;
			for (int j = 0; j < b.length; j++) {
				
				if(a[i]==b[j])
				{
					      
					count1++;
					break;
				}
			}
			if(count1==0)
			{
				b[index++]=a[i];
				
			}
		}
		
		System.out.println(count);
		System.out.println();
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}

	}

}
