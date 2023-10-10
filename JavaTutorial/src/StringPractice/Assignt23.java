package StringPractice;

public class Assignt23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "abcd";
		char s1 = 'c';
		      
		int frequency =0;
		
		for (int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i)==s1) {
			
				frequency++;
			}
		}
		System.out.println(frequency);
	}

}
