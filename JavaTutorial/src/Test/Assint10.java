package Test;

public class Assint10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abc";
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
			else if(s1[i]=='c')
			{
				s1[i]='z';
			}
			
			s = new String(s1);
		}
		System.out.println(s);
		
	}

}
