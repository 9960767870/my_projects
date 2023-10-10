 package StringHW;

public class EndsWith2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "rushi";
		String s2 = "hi";
		System.out.println(s1.endsWith(s2));
		
		if(s2.length()<=s1.length())
		{
			int i = s1.length()-1;
			int j = s2.length()-1;
			
			while(j>=0)
			{
				if(s1.charAt(i)!=s2.charAt(j))
			        i--; 
					j--;
			}
			if(j>0)
			{
				System.out.println(false);
			}
			else {
				System.out.println(true);
			}
		}

	}

}
