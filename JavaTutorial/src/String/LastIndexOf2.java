package String;

public class LastIndexOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "abcdabdf";
		String s2 = "ab";
		System.out.println(s1.lastIndexOf(s2));
		int index = -1;
		
		if(s2.length()<=s1.length())
		{
			int i = s1.length()-s2.length();
			for(;i>=0;i--)
			{
				if(s1.charAt(i)==s2.charAt(0))
				{
					String substring = "";
					for (int j = i; j <i+s2.length(); j++) 
					{
						substring = substring+s1.charAt(j);
					}
					if(substring.equals(s2))
					{
					     index=i;
					     break;
					}
				}
			}
			System.out.println(index);
			
		}
		else
			System.out.println(-1);
	}

}
