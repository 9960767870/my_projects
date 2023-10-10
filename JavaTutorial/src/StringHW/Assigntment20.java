package StringHW;

public class Assigntment20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "abcdabcdefgh";
		int max = 0;
		int start = 0;
		for (int i = 0; i < s1.length(); i++) 
		{
			for (int j = i+1; j < s1.length(); j++) 
			{
				int count=0;
				for (int k = i; k <j-1; k++) 
				{
					if(s1.charAt(k)==s1.charAt(j))
					{
					
						count++;
					
				}
				}
					if(count>0)
					{
						int lengthofindex = j-1-i+1;
						if(lengthofindex>max)
						{
						     max=lengthofindex;
						      start=i;
						}
					
					break;
				}
			
					if(j==s1.length()-1)
					{
						int lengthofindex = j-i+1;
						if(lengthofindex>max) 
						{
						     max=lengthofindex;
						      start=i;
					}
				
					}
		}	
	}
		System.out.println(max);
		
		for (int i = start; i < start+max; i++) {
			System.out.print(s1.charAt(i));
		}
		}
	}

