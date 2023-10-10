package String;

public class Emptymethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = " ";
		System.out.println(s.isEmpty());
		System.out.println(myIsEmpty(s));
		
	}
	
	public static boolean myIsEmpty(String s)
	{
		if(s.length()==0)
			return true;
		else
			return false;
	}

}
