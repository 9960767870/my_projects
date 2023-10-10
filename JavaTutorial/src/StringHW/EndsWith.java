package StringHW;

public class EndsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "rushi";
		String s2 = "hi";
		System.out.println(s1.endsWith(s2));
		int count=0;
		if(s2.length()<=s1.length())
		{
			int k = s1.length()-1;
			for (int i = s2.length()-1;i>=0; i--) 
			{
					if(s2.charAt(i)!=s1.charAt(k))
					{
						count++;
						
					}
					
					k--;		
				}
				if(count>0)
				{
					System.out.println(false);
				}
				else {
					System.out.println(true);
				}
				
			}
		else {
               System.out.println(false);			
		}
			
		}
		
	}


