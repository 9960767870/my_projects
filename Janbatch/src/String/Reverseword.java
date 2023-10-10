package String;

public class Reverseword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "I am rushikesh bhosale";
		
//		String[] s1 = s.split(" ");
		
//		for (int i = s1.length-1; i>=0; i--) 
//		{
//			System.out.println(s1[i]);
//			s=s1[i];
//		}
		//System.out.println(s);
		
		String s1="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
		}
		  s=s1;
		 System.out.println(s);
	}

}
