package String;

public class IndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "rushi";
		String s2 = "ru";
		System.out.println(s1.indexOf(s2));
		
		if(s2.length()==0)
			System.out.println(0);
		if(s2.length()<=s1.length())
		{
			int i = 0;
			for (; i < s2.length(); i++) {
				
				if(s1.charAt(i)==s2.charAt(0))
				{
					String substring  = s1.substring(i, i+s2.length());
					if(substring.equals(s2))
					{
						System.out.println(i);
						System.out.println(s2.charAt(i));
						
						
					}
				}
			}
			if(i==s1.length())
			
			    System.out.println(-1);
			}
			else 
				System.out.println(-1);
		     		
		}
		
	}
	


