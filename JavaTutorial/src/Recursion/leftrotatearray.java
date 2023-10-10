package Recursion;

public class leftrotatearray {


	static int[] a = {10,20,30,40,50,60,70,80};
	static int temp = 0;
	
	public static void main(String[] args) {


		System.out.println();
		int temp=a[0];
		a[a.length-1] = temp;
		loopi(0);
	}

	private static void loopi(int i) {

     if(i<a.length-1)
     {
    	 print(i);
    	 a[i]=a[i+1];
    	 loopi(i+1);
    	 
     }
	}



	private static void print(int i) {

       System.out.println(a[i]);
		
	}
	
	}




