package String;

public class Blankmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "osjc";
		
		//System.out.println(s.isBlank());
		System.out.println(isBlankMethod(s));
		
	}
	

	public static boolean isBlankMethod(String s)
	{
		
		if(s.length()==0)
			return true;
		else
		{
			for (int i = 0; i < s.length(); i++) {
				
				if(s.charAt(i)!=' ')
					return false;
			}
			return true;
		}
		
	}

}
