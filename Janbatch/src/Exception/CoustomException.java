package Exception;

public class CoustomException {

	public static void main(String[] args)throws Exception {
		
		
		int a=100;
		int b=1000;
		
		
		if(a<1 || b>99)
			throw new MyCoustomException("this is my exception");
		else
			
		System.out.println(a/b);
	    
			
		
	}
}
