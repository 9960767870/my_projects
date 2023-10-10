package Test;

public class Assignt6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {12,13,14,15,10};
		int num = 10;
		int count =0;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]==num) {
				count++;
			}
		}
			int index = 0;
			int[] b = new int[a.length-count];
			for (int j = 0; j < b.length; j++) {
			if(a[index]!=num) {
				b[index++]=a[j];
			}	
			}
	
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]+" ");
		}

}
}
