package String;

public class tochararraymethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "rushi";
		char[] ch = s1.toCharArray();
		
		char[] ca = mychararray(s1);
		
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		System.out.println();
		
		for (int i = 0; i < ca.length; i++) {
			System.out.print(ca[i]);
		}
	}

	private static char[] mychararray(String s1) {
		
		char [] ca = new char[s1.length()];
		
		for (int i = 0; i < ca.length; i++) {
			
			        ca[i]=s1.charAt(i);
		}
		return ca;
	}

}
