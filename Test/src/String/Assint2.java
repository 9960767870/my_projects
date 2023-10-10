package String;

public class Assint2 {

	public static void main(String[] args) {
		
		String[] s = {"abc","aa","a", "ab" , "rushi", "bhosale"};
		
		for (int i = 0; i <s.length; i++) 
		{
			for (int j = i+1; j <s.length; j++) 
			{
				if(s[i].length()>(s[j].length()))
			{
					String temp = s[i];
					s[i] = s[j];
					s[j] = temp;
					
			}
			}
		}
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
		

	}

}
