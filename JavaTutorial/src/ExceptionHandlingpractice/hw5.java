package ExceptionHandlingpractice;

public class hw5 {

	public static void main(String[] args) {
	
		int[] a = {1,2,3,4,5};
		
		try
		{
			System.out.println(a[8]);
		}
		catch (Exception e) {
			
			System.out.println("handlle in array");
		}

	}

}
