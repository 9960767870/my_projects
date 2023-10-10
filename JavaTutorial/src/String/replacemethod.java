package String;

public class replacemethod {

	public static void main(String[] args) {
		
		String s1 = "xyz";
		
		System.out.println(s1.replace('x', 'p'));
		
		       String s2= myReplacemethod(s1,'x','p');
		       System.out.println(s2);

	}

	private static String myReplacemethod(String s1, char oldcahr, char newchar) {
		
		char[] ca = s1.toCharArray();
		
		for (int i = 0; i < ca.length; i++) {
			
			if(ca[i]=='x')
				ca[i]='p';
			else if(ca[i]=='y')
				ca[i]='q';
			else if(ca[i]=='z')
				ca[i]='r';
		}
		
		String s2 = new String(ca);
		return s2;
		
	}

}
