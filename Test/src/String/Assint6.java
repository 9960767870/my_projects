package String;

public class Assint6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abc";
		String s1 = "abc";
		
		System.out.println(s.startsWith(s1));
		
		int diffcount=0;
		if(s1.length()<=s.length())
		{
			for (int i = 0; i <s.length(); i++) {
				
				if(s.charAt(i)!=s1.charAt(i))
				{
					diffcount++;
					//break;
				}
			}
		}
		if(diffcount>0)
			System.out.println(false);
		else
			System.out.println(true);
	}

}
