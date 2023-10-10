package String;

public class Touppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "abcd";
		
		  
		String obj = s1.toUpperCase();
		System.out.println(obj);
		
		
		        String obj2  = myUppercase(s1);
		        System.out.println(obj2);
	}

	private static String myUppercase(String s1) {
		
		char [] ch = s1.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			
			if(ch[i]>='a' && ch[i]<='z')
			{
				int num=ch[i];
				int num2 = num-32;
				char ca = (char) num2;
				   ch[i]=ca;
			}
		}
		
		String s4 = new String(ch);
		return s4;
	}

}
