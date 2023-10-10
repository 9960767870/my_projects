package Recursion;

public class Basic2 {
	
	static int i = 1;
	static int num = 4;
	
	
 private static void table() {
		if(i<=10)
		{	
		System.out.println(i*num);
		i++;
		table();
		}
	}

	public static void main(String[] args) {
		
		table();
  
	}

	

}
