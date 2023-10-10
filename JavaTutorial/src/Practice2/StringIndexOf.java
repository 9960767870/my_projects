package Practice2;

public class StringIndexOf {

	public static void main(String[] args) {
		
		String s = "abcdef";
		String s1 = "b";
		
		
		if(s1.length()<=s.length())
		{
		int i = 0;
		for (; i < s.length(); i++) {
			
			if(s.charAt(i)==s1.charAt(0))
			{
				String subString = s.substring(i, i+s1.length());
				
				if(subString.equals(s1))
				{
					System.out.println("index at:"+i);
					break;
				}
						
			}
		}
		
		if(i==s.length())
		{
			System.out.println("not found index");
		}
		}	
	}

}
