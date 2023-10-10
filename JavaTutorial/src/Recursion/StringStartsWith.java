package Recursion;

public class StringStartsWith {

	public static void main(String[] args) {
		
		String s1 = "abcdefghijk";
		String s2 = "abcd";
		
		boolean startsWith = true;
		
		if(s1.length()>=s2.length())
		
			startsWith = myStartsWith(s1,s2,0,startsWith);
		
		else 
			startsWith = false;
			System.out.println(startsWith);
	
	}

	private static boolean myStartsWith(String s1, String s2, int i, boolean startsWith) {
		
		if(i<s2.length())
		{
			if(s1.charAt(i)!=s2.charAt(i))
			{
				startsWith=false;
				return startsWith;
			}
			return myStartsWith(s1,s2,i+1,startsWith);
		}
		return startsWith;
	}
	}

