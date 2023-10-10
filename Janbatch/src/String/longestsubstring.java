package String;

public class longestsubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abcdabcab";
		
		int max = Integer.MIN_VALUE;
		int index=0;
		
		for (int i = 0; i <s.length(); i++) {
			
			for (int j = i+1; j <s.length(); j++) {
				
				int count=0;
				
				for (int k = i; k <j; k++) {
					
					if(s.charAt(k)==s.charAt(j))
					{
						count++;
					}
				}
				
				if(count>0)
				{
					int len = j-i;
					if(len>max)
					{
						max=len;
						index=i;
						break;
					}
				}
				if(j==s.length()-1)
				{
					int len = j-i+1;
					if(len>max)
					{
						max=len;
						index=i;
						break;
					}
				}
			}
		}
		
		System.out.println(max);
		
		for (int i = index; i <index+max; i++) {
			System.out.print(s.charAt(i)+" ");
		}
	}

}
