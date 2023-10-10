package String;

public class Assigntment20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abcdabcdefghabc";
		
		int max = 0;
		int start = 0;
		
		// i is start of substring is inclusive
		
		for (int i = 0; i <s.length(); i++) 
		{
		  //j is end of substring i is exclusive
		   for (int j = i+1; j <s.length(); j++) 
		   { 
			  int count = 0;
//			  1 to j-1 is our starting
			  //we need to check if we can add j wala count in your in our substring
			  for (int k = i; k <= j-1; k++)  
			  { 
				if(s.charAt(k)==s.charAt(j)) {
					count++;
				}
			
			}
			  //we cant add means jwc is there in our substring
			  //in start case check with max
			  if(count>0) 
			  { 
				int lengthOfSubstring = j-1-i+1;
				if(lengthOfSubstring>max) {
					max = lengthOfSubstring;
					start=i;
				}
				break;
			  }
			  if(j==s.length()-1) {
				  int lengthOfSubstring = j-i+1;
					if(lengthOfSubstring>max) {
						max = lengthOfSubstring;
						start=i;
					}  
			  }
		}
			
		}
		System.out.println(max);
		for (int i = start; i < start+max; i++) {
			System.out.print(s.charAt(i));
		}

	}

}
