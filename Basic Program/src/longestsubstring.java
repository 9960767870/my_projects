
public class longestsubstring {

	public static void main(String[] args) {
		

		String s = "abcdeabcdabc";
		int start=0;
		int max =0;
		
		for (int i = 0; i <s.length(); i++) 
		{
			for (int j = i+1; j <s.length(); j++) 
			{
				int count=0;
				
				for (int k = i; k <j-1; k++) 
				{
					if(s.charAt(k)==s.charAt(j))
						count++;
					   
					
				}
				
				if(count>0)
				{
					int longestsubstring = j-1-i+1;
					if(longestsubstring>max)
					{
						max=longestsubstring;
					  start=i;
					}
					break;	
				}
				
				if(j==s.length()-1)
				{
					int longestsubstring = j-i+1;
					if(longestsubstring>max)
					{
						max=longestsubstring;
					  start=i;
				}
				}
				
			}
			
			
		}
		
		for (int i = start; i <start+max; i++) 
		{
			System.out.print(s.charAt(i));
			
		}
	}

}
