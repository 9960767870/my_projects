package ExceptionHandlingpractice;

class Myclass extends Exception
{
	public Myclass(String s) {
		super(s);
		
	}
}

public class Assint7 {

	public static void main(String[] args) throws Myclass {
		
		
		throw new Myclass("not found");
		  
	

	}

}
