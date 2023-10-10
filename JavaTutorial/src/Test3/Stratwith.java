package Test3;

public class Stratwith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abcd";
		String s1 = "ab";
		System.out.println(s.startsWith(s1));
		int diffcount = 0;
		
		if(s1.length()<=s.length()) {
		for (int i = 0; i <s1.length(); i++) {
			
			if(s1.charAt(i)!=s.charAt(i))
			{
				diffcount++;
				
			}
		}
		if(diffcount>0)
		{
			System.out.println(false);
		}
		else {
			System.out.println(true);
		}
		}
		
		String a = "Rushi";
		String aa = "u";
		System.out.println(aa.compareTo(a));
	}

}
