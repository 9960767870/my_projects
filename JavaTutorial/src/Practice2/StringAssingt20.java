package Practice2;

public class StringAssingt20 {

	public static void main(String[] args) {
		
		String s = "abcdabcdefabc";
		
		int start = 0;
		int max = 0;
		
		for (int i = 0; i < s.length(); i++) {
			
			for (int j = i+1; j <s.length(); j++) {
				
				int count = 0;
				
				for (int k = i; k < j-1; k++) {
					
					if(s.charAt(k)==s.charAt(j))
					{
						count++;
					}
				}
				
				if(count>0)
				{
					int lengthOfSubstring = j-1-i+1;
					if(lengthOfSubstring>max)
					{
						max=lengthOfSubstring;
						  start=i;
					}
					break;
				}
				
				if(j==s.length()-1)
				{
					int lengthOfSubstring = j-i+1;
					
					if(lengthOfSubstring>max)
					{
						max=lengthOfSubstring;
						start=i;
					}
				}
			}
		}
        System.out.println(max);
        for (int i = start; i <max+start; i++) {
			System.out.print(s.charAt(i));
		}
	}

}
