package String;

public class Assigntment31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abcXYZ";
		
		s = s.toUpperCase();
		
		String s1 = "";
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			int num = ch;
			int num2 = 155-num;
			char ch2 = (char) num2;
			s1 = s1+ch2;
		}
		System.out.println(s1);
	}

}
