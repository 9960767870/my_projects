package String;

public class Assigntment23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Learn java";
		char s1 = 'r';
		int frequency = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if(s1==s.charAt(i)) {
				frequency++;
			}
			
		}
		System.out.println(frequency);

	}

}
