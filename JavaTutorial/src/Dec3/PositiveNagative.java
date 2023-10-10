package Dec3;

public class PositiveNagative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,-1,11,-2,-1,1,1,1,-11,-1,-1,};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]<0 && a[j]>0) {
					
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}

	}

}
