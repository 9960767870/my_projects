package String;

public class Assint7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "rushikesh";
		String s1 = "rushikesh";
		
		System.out.println(s.endsWith(s1));
		
		int diffcount=0;
		if(s1.length()<=s.length())
		{
			for (int i = s.length()-1; i>=0; i--) 
			{
				if(s.charAt(i)!=s1.charAt(i))
				{
				  diffcount++;
				}
				
			}
		}
		
		if(diffcount>0)
			System.out.println(false);
		else
			System.out.println(true);

	}

}
