package String;

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Rushikesh";
		System.out.println(s.charAt(1));
		
		
		String s1 = "pqr";
		System.out.println(s1.codePointAt(0));
		
		String s2 = "pqr";
		System.out.println(s2.codePointBefore(1));
		
		String s3 = "r";
		System.out.println(s3.compareTo("R"));
		
		String s4 ="R";
		System.out.println(s4.compareToIgnoreCase("p"));
		
		String s5 = "Hef";
		System.out.println(s5.concat("Shine"));
		
		String s6 = "bhosale";
		System.out.println(s6.contains("bhosale"));
		
		String s7 = "varad";
		System.out.println(s7.endsWith("ad"));
		
		String s8 = "sachin";
		System.out.println(s8.startsWith("a"));
		
		String s9 = "jadhav";
		System.out.println(s9.equals("jadhav"));
		
		String s10 = "abcd";
		System.out.println(s10.indexOf("b"));
		
		String s11 = "xyzx";
		System.out.println(s11.lastIndexOf("x"));
		
		
		String s12 = "Rushi";
		System.out.println(s12.length());
		
		String s13 = "don";
		System.out.println(s13.replace("don", "rushi"));
		
		String s14 = ("I Am Good Boy");
		String[] s15 = (s14.split(" "));
		for (int i = 0; i < s15.length; i++) {
			System.out.println(s15[i]);
		}
	

}
}