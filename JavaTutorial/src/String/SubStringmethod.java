package String;

public class SubStringmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "rushikeshbhosale";
		
		int start=2;
		int end = 8;
		System.out.println(s1.substring(2, 8));
		
		       String  obj = mySubString( s1,start,end);
		       System.out.println(obj);
	}

	private static String mySubString(String s1, int start, int end) {
		
		String s = "";
		
		for(int i=start;i<end;i++)
		{
			s=s+s1.charAt(i);
		}
		
		return s;
	}

}
