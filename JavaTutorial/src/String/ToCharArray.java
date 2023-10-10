package String;

public class ToCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abcdabcdab";
		
		char[] s1 = s.toCharArray();
		
		for (int i = 0; i < s1.length; i++) {
			
			if(s1[i]=='a')
			{
				s1[i]='x';
			}
			else if(s1[i]=='b')
			{
				     s1[i]='y';
			}
		}
		
		s = new String(s1);

		System.out.println(s);
	}

}
