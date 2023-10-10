package Recursion;

public class StringContaintMethodUsingRecuirsion {

	public static void main(String[] args) {
	
		String s1 = "abcdefghijklm";
		String s2 = "cdef";
		
		boolean result = myCompareTo(s1,s2);

	}

	private static boolean myCompareTo(String s1, String s2) {
		
		int count = 0;
		if(s1.length()>=s2.length())
		{
			count = cheakMyString(s1,s2,count,0);
		}
		if(count==0)
		{
		return false;
		}
		else {
			return true;
		}
		
	}

	private static int cheakMyString(String s1, String s2, int count, int i) {
		
		if(i<s1.length()-s2.length())
		{
			if(s1.charAt(i)==s2.charAt(0))
			{
				String sTemp = "";
				int j=i;
				sTemp = buildMyString(s1,s2,i,j,sTemp);
				if(sTemp.compareTo(s2)==0)
				{
					count++;
					return count;
				}
						
				
			}
		}
		
		return 0;
	}

	private static String buildMyString(String s1, String s2, int i, int j, String sTemp) {
		// TODO Auto-generated method stub
		return null;
	}

}
