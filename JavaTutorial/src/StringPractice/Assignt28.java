package StringPractice;

public class Assignt28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   String[] s = {"ab", "a","abc", "abcde", "adcd", "abcdefgh" ,"abcde" ,"abcdef"};
	   
	   for (int i = 0; i < s.length; i++) {
		for (int j = i+1; j < s.length; j++) {
			if(s[i].length()>s[j].length())
			{
				String ss = s[i];
				s[i] = s[j];
				s[j] = ss;
			}
			
		}
	}
	   for (int i = 0; i < s.length; i++) {
		System.out.println(s[i]+" ");
	}

	}

}
