package String;

public class CompareTomethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "rushi";
		String s1 = "Rushi";
		
		System.out.println(s.compareTo(s1));
		
		int num =myCompareTo(s, s1);
		System.out.println(num);
		
	}
	
	public static int myCompareTo(String s , String s1)
	{
		
		for(int i=0;i<s.length() && i<s1.length();i++)
		{
			
			char ch = s.charAt(i);
			char ch1 = s1.charAt(i);
			
			if(ch!=ch1)
			{
				int difflen = ch-ch1;
				return difflen;
			}
		}
		
		int len = s.length()-s1.length();
		
		return len;
	}

}
