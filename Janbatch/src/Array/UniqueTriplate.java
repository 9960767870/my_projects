package Array;

public class UniqueTriplate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10,20,30,40,50};
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a.length; j++) {
				
				for (int k = 0; k < a.length; k++) {
					
					if(a[i]+a[j]+a[k]<50)
					System.out.println(a[i]+" "+a[j]+" "+a[k]);
				}
			}
		}

	}

}
