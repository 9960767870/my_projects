package StringHW;

public class ContainsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "abcdefgh";
		String s2 = "fdg";
		System.out.println(s1.contains(s2));
		
		if(s2.length()<=s1.length())
		{
			int i=0;
			for (; i < s1.length(); i++) 
			{
				if(s1.charAt(i)==s2.charAt(0))
				{
					String substring = s1.substring(i, i+s2.length());
				 
						if(substring.equals(s2))
						{
							System.out.println(true);
							break;	
				          }			
				
				}
				}
			if(i==s1.length()) {
				
				System.out.println(false);
			        }
			}
			
			else {
				System.out.println(false);
			}
	
			
		
	}
}
