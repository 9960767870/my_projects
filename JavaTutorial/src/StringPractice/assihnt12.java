package StringPractice;

public class assihnt12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "abcd";
		String s2 = "c";
		
		System.out.println(s1.indexOf(s2));
		if(s2.length()<=s1.length())
		{
		
		   int i=0;
		for (;  i< s1.length(); i++) {
			
			if(s1.charAt(i)==s2.charAt(0))
			{
				String subString = s1.substring(i, i+s2.length());
				
				if(subString.equals(s2))
				{
					System.out.println(i);
					break;
				}
						
			}
			
		}
		
		if(i==s1.length())
		{
			System.out.println(-1);
		}
		}
		else
		{
			System.out.println(false);
		}
		
	}

}
