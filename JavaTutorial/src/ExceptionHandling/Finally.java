package ExceptionHandling;

public class Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3,4};
		
		try
		{
			System.out.println(a[5]);
		}
		catch (Exception e) {
			System.out.println(a[6]);
		}
		finally {
			System.out.println(a.length);
		}

	}

}
