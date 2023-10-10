package Practice2;

public class StringContainswith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abcdefgh";
		String s1 = "de";
		System.out.println(s.contains(s1));
		
		if(s1.length()<=s.length())
		{
			int i = 0;
		for (; i <s.length(); i++) 
		{
			
			if(s.charAt(i)==s1.charAt(0))
			{
				String subString = s.substring(i, i+s1.length());
				
				if(subString.equals(s1))
				{
					System.out.println(true);
					break;
				}
						
			}
		}
		
		if(i==s.length())
		
			System.out.println(false);
		
		}
		else
		{
			System.out.println(false);
		}
	
	}
	}

