package Array;

public class LeaderElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {8,3,5,3,5,1};
		
		for (int i = 0; i < a.length; i++) {
			int count =0;
			for (int j = i+1; j < a.length; j++) {
				if(a[i]<a[j]) {
					count++;
				}
			
				}
			if(count==0) {
				System.out.println(a[i]);
			}
		}

	}

}
