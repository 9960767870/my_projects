package String;

public class Startwith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "rushi";
		String s2 = "rushi";
		
		System.out.println(s1.startsWith(s2));
		
		boolean num=isStartwith(s1, s2);
		System.out.println(num);
	}
	
	public static boolean isStartwith(String s1,String s2)
	{
		if(s2.length()>s1.length())
			return false;
		
		for (int i = 0; i <s2.length(); i++) {
			
			char ch = s1.charAt(i);
			char ch1 = s2.charAt(i);
			
			if(ch!=ch1)
			return false;
		}
		return true;
	}

}
