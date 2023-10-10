package Practiceset;

public class SubString {

	public static void main(String[] args) {
		
		String s = "ABAAB";
		
		for (int i = 0; i < s.length(); i++) 
		{
		   for (int j = i+2; j <s.length(); j++) 
		   {
			
			   String s1 = s.substring(i, j);
			   
			//   System.out.println(s1);
			  
			   boolean result = isplindrome(s1);
			   
			   if(result)
			   {
				   System.out.println(s1);
			   }
		}
			
		}

	}

	private static boolean isplindrome(String s1) {
		
		int i=0;
		int j = s1.length()-1;
		
		while(i<j)
		{
			if(s1.charAt(i)!=s1.charAt(j))
			{
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
