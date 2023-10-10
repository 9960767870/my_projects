package String;

public class Assint4 {

	public static void main(String[] args) {
		
		String s = "rushikesh";
		String s1 = "h";
		
		int index = -1;
		System.out.println(s.lastIndexOf(s1));

		if(s1.length()<=s.length())
		{
			int i = 0;
			for (; i <s.length()-s1.length()+1; i++) 
			{
				if(s.charAt(i)==s1.charAt(0))
				{
					String subString = s.substring(i, i+s1.length());
					
					if(subString.equals(s1))
					{
						  index=i;
					}
					
				}
					
			}
			System.out.println(index);	
			
		}
		else
			System.out.println(-1);
	}

}
