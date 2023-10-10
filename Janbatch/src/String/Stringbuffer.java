package String;

public class Stringbuffer {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer s1 = new StringBuffer("rushi bhosale");
		
		s1.append("ididid");
		s1.delete(13, 19);
		
		s1.insert(13, 'R');
		//s1.reverse();
		s1.replace(0, 5, "RUSHI");
		s1.setCharAt(13, 'D');
		System.out.println(s1);
		
	}

}
