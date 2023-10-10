package String;

public class replaceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abcde";
		
		char[] s1 = s.toCharArray();
		
		for (int i = 0; i < s1.length; i++) 
		{
			if(s1[i]=='a')
			{
				s1[i]='r';
			}
			else if(s1[i]=='b')
			{
				s1[i] = 'u';
			}
			else if(s1[i]=='c')
			{
				s1[i] = 's';
			}
			else if(s1[i]=='d')
			{
				s1[i] = 'h';
			}
			else if(s1[i]=='e')
			{
				s1[i] = 'i';
			}
			
		}
		for (int i = 0; i < s1.length; i++) {
			System.out.println(s1[i]+" ");
		}

	}

}
