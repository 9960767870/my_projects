
public class Customexception 
{

	public static void main(String[] args) throws Myownexception {
		
		throw new Myownexception("myownexception");

	}

}

class Myownexception extends Exception
{
	public Myownexception(String s) {
		// TODO Auto-generated constructor stub
		super(s);
		System.out.println("my exception");
	}
}
