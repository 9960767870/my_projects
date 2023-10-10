package Dec3;

public class Assignt6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,1,3,4,5,3,6};
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]==a[j]) {
					
					count++;
					break;
				}
			}
		
		}
		
		int index = 0;
		int[] b = new int[a.length-count];
		
			for (int i = 0; i < b.length; i++) {
				int count1 = 0;
				for (int j = 0; j < b.length; j++) {
					
				if(a[i]==b[j]) {
	
				 count++;
				 break;
			 }
				}
				if(count1 == 0) {
					b[index++]=a[i];
				}
		}
			for (int i = 0; i < b.length; i++) {
				System.out.println(b[i]+" ");
			}

	}

}
