package String;

public class Assint10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "rushi";
		String s1 = "h";
		System.out.println(s.contains(s1));
		
		if(s1.length()<=s.length())
		{
			for (int i = 0; i < s.length(); i++) 
			{
				if(s.charAt(i)==s1.charAt(0))
				{
					String subString = s.substring(i, i+s1.length());
					
					if(subString.equals(s1))
					{
						System.out.println(true);
						break;
					}
					System.out.println(false);
					
				}
					
			}
//			if(i==s.length())
//				System.out.println(false);
			
		}
	}

}
