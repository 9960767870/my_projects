package ExceptionHandling;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abcd";
		int[] a = {1,2,3,4};
		int x = 5;
		int y = 2;
		
		
			try
			{
			System.out.println(x/y);
			}
			catch (Exception e) {
				System.out.println("can't devided by zero");
			}
			
		}
		

	}


