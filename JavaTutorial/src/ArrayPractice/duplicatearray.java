package ArrayPractice;

public class duplicatearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {10,20,10,20,30,40,50};
		
		
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i] == a[j])
				{
//					count++;	
				     System.out.println(a[j]);
				}
				
			}
			
			
		}
//	for (int i = 0; i < a.length; i++) {
//		System.out.println(a[i]);
//	}

	}

}
