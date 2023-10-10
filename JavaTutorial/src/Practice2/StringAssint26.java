package Practice2;

public class StringAssint26 {

	public static void main(String[] args) {
		
		String[] s = {"ab","a","abc","abcde","abcd","abcdef"};
		
		
		for (int i = 0; i < s.length; i++) {
			
			for (int j = i+1; j < s.length; j++) {
				
				if(s[i].length()>s[j].length())
					
				{
					String sc = s[i];
					s[i] = s[j];
					s[j] = sc;
				}
			}
		}
		
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		

	}

}
