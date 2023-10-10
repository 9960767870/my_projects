package Practice2;

public class Stringassingt8 {

	public static void main(String[] args) {
		
		String s = "abcdefgh";
		String s1 = "";
		
		for (int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i)!='d')
			{
			        s1 = s1+s.charAt(i);
			}
		}
		System.out.println(s1);

	}

}
