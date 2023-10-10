package String;

public class Tolowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "ABCD";
		
		System.out.println(s1.toLowerCase());
		
		String obj = myLowercase(s1);
		System.out.println(obj);
	}

	private static String myLowercase(String s1) {
		
		char[] ch = s1.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			
			if(ch[i]>='A' && ch[i]<='Z')
			{
				int num = ch[i];
				int num2 = num+32;
				char ca = (char)num2;
				     ch[i]=ca;
			}
		}
		
		String s4 = new String(ch);
		return s4;
	}

}
