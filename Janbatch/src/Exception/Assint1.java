package Exception;

public class Assint1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
//		
//		try {
//			System.out.println("before");
//			System.out.println(5/0);
//			System.out.println("after");
//			
//		} 
//		
//		catch (Exception e) {
//			
//			System.out.println("I am catch block");
//		}
//		
//		
//		System.out.println("I am rushi");
		try {
			throw new Exception("eihuwhcf");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		

	}

}
