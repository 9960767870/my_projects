package String;

public class Assigntment28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] s = {"ab","abc","abcd","a","ab","abcde"};
		
		for (int i = 0; i < s.length; i++) {
			for (int j = i+1; j < s.length; j++) {
				if(s[i].length()>s[j].length()) {
				String temp = s[i];
				s[i] = s[j];
				s[j] = temp;
			}
		}
		}
		
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}

	}

}
