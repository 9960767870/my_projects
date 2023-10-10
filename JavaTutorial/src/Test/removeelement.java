package Test;

public class removeelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "rushizkesh";
		String s1 = "";
		
		for (int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i)!='z') {
			s1 = s1+s.charAt(i);
		}
		}
		System.out.println(s1);

	}

}
