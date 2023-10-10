package Ooops;

public class Method {

	public static void main(String[] args) {
	
		Xerox x = new Xerox();
		
		x.num=200;
		x.login();
	}

}

class Xerox
{
	 static int num = 100;
	
	public static void login()
	{
		System.out.println("Enter your login");
		System.out.println(num);
	}
}
