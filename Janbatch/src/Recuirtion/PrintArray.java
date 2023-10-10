package Recuirtion;

public class PrintArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int[] a = {11,22,33,44,55,66,77};
		
		int i=0;
		print(a,i);
		
	}

	private static void print(int[] a, int i) {
		
		if(i<a.length)
		{
			
			System.out.println(a[i]);
			print(a, i+1);
		}
		else
			return;
		
	}

}
