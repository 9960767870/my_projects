package String;

public class Assint31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abcdXYZ";
		
		s=s.toUpperCase();
		
		String s1="";
		
		for (int i = 0; i <s.length(); i++) {
			
			  int num =s.charAt(i);
			  int num2 = 155-num;
			  char ch = (char) num2;
			  s1=s1+ch;
		}
		
		System.out.println(s1);

	}

}
