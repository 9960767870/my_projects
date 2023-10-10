package StringPractice;

public class TocharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String s = "rushikesh";
	
	char[] s1 = s.toCharArray();
	
	for (int i = 0; i < s1.length; i++) {
		
		if(s1[i]=='i')
		{
			s1[i]='k';
		}
	}
	  
	     s = new String(s1);
	     System.out.println(s);
	

	}

}
