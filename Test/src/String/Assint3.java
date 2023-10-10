package String;

public class Assint3 {

	public static void main(String[] args) 
	{
	
		String s = "rhshi";
		String s1 = "h";
		System.out.println(s.lastIndexOf(s1));
		int index = -1;
		
		if(s1.length()<=s.length())
		{
			
			for (int i =s.length()-s1.length(); i>=0 ; i--) 
			{
				if(s.charAt(i)==s1.charAt(0))
				{
					String subString = s.substring(i, i+s1.length());
					
					if(subString.equals(s1))
					{ 
						index=i;
					break;
					}
					
				}	
			}
			System.out.println(index);
			
			
		}
		
	}
}
