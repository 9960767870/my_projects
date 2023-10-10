package String;

public class Assint9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abc stu pqr xyz";
		
		String[] s1 = s.split(" ");
		
		for (int i = 0; i < s1.length; i++) {
			System.out.println(s1[i]+" ");
		}
		System.out.println();
		
		int spacecount=0;
		
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)==' ')
			{
	          		spacecount++;	
			}
			
		}
		
		String[] sa = new String[spacecount+1];
		
		int saindex=0;
		String s3 = "";
		
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)==' ')
			{
				  sa[saindex++]=s3;
				  s3 = "";
			}
			else
			{
				s3 = s3+s.charAt(i);
			}
			
			if(i==s.length()-1)
			{
				    sa[saindex++]=s3;
			}
		}
		
		for (int i = 0; i < sa.length; i++) 
		{
			System.out.print(sa[i]+" ");
			
		}
		

	}

}
