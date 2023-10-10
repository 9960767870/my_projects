package StringPractice;

public class Assignt31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abcdXYZ";
		
		String s1 = "";
		
		s = s.toUpperCase();
		
		for (int i = 0; i < s.length(); i++) {
			
			char c = s.charAt(i); 
			int num = c;
			int num2 = 155-num;
			char ch2 = (char) num2;
			s1 = s1+ch2;
			
		}
		System.out.println(s1);
		
	}

}
