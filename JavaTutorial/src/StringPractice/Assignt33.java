package StringPractice;

public class Assignt33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "45321";
		
		char[] s1 = s.toCharArray();
		
		for (int i = 0; i < s1.length; i++) {
			for (int j = i+1; j < s1.length; j++) {
				
				if(s1[i]>s1[j])
			{
				char ch = s1[i];
				s1[i] = s1[j];
				s1[j] = ch;
			}
			}
			
		}	
		
	     s = new String(s1);
	     System.out.println(s);
	}

}
