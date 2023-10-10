package StringPractice;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "abc pqr stu xyz";
		
		String[] s2 = s1.split(" ");
		
		for (int i = 0; i < s2.length; i++) {
			System.out.println(s2[i]);
		}
		
		int spacecount = 0;
		for (int i = 0; i < s1.length(); i++) {
			
			if(s1.charAt(i)==' ')
			{
			   spacecount++;	
			}
		}
			
			String[] sa = new String[spacecount+1];
			int saindex = 0;
			String s3 = "";
			for (int j= 0; j < s1.length(); j++) {
				
				if(s1.charAt(j)==' ') {
				          sa[saindex]= s3;
				          saindex++;
				          s3 = "";
				}
				else 
				{
					s3 = s3+s1.charAt(j);
				}
			
			if(j==s1.length()-1)
			{
				 sa[saindex]= s3;
			}
					
		}
		for (int i = 0; i < sa.length; i++) {
			System.out.print(sa[i]+" ");
		}

	}

}
