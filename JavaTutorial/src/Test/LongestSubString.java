package Test;

public class LongestSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abcdabcdefabc";
		int max = 0;
		int start = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j <s.length(); j++) {
				int count = 0;
				for (int k = i; k <j-1; k++) {
					
					if(s.charAt(k)==s.charAt(j))
					{
					     count++;	
				
					}
				    
				}
				if(count>0)
				{
					int lengthofsubstring = j-1-i+1;
					if(lengthofsubstring>max)
					{
						        max=lengthofsubstring;
						        start=i;
					}
					 break;	
				}
				
				if(j==s.length()-1)
				{
					int lengthofsubstring = j-i+1;
					if(lengthofsubstring>max)
					{
						        max=lengthofsubstring;
						        start=i;
				}
				}
			}
		}
		
		System.out.println(max);
		for (int i = start; i < max+start; i++) {
		      System.out.print(s.charAt(i));	
		}

	}

}
