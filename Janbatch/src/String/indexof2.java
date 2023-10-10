package String;

public class indexof2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "rushikesh";
		String s2 ="ke";
		
		System.out.println(s1.indexOf(s2));
		
		int obj = myindexof(s1,s2);
		System.out.println(obj);
	}

	private static int myindexof(String s1, String s2) {
		// TODO Auto-generated method stub
		
		if(s2.length()==0)
			return 0;
		if(s2.length()<=s1.length())
		{
			int i = 0;
			for (; i <s1.length(); i++) {
				
				if(s1.charAt(i)==s2.charAt(0))
				{
					String subString = s1.substring(i, i+s2.length());
							if(subString.equals(s2))
							{
								return i;
							}
				}
			}
			if(i==s1.length())
				return -1;
			
		}
		return -1;
	}

}
