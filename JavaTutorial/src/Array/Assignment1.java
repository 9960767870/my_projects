package Array;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {10,20,30,40,50};
		
		int num = 30;
		int index = Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==num) {
				
				index=i;
			}
		}
		if(index==-1) {
			System.out.println("no");
		}
		else {
			System.out.println("index"+" "+index);
		}

	}

}
