package StringHW;

public class Test {

	
	
	public static void main(String[] args) 
	{
		String s1 = "rushi";
		String s2 = "l";
		
		if(s2.length()==0)
			System.out.println(0);
		
		if(s2.length()<=s1.length())
		{
			int i = 0;
			for (; i <s1.length(); i++) {
				
				if(s1.charAt(i)==s2.charAt(0))
				{
					String subString = s1.substring(i, i+s2.length());
					
					if(subString.equals(s2))
						System.out.println(i);
				}
			}
			if(i==s1.length()-1)
				System.out.println("index : "+-1);
			else
				System.out.println(-1);
				
			}


	}

}
