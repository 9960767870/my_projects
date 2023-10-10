package StringHW;

public class Assignt13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "RushiDbhosale";
		
		String s1 = "";
		
		for (int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i)!='D') {
				s1 = s1+s.charAt(i);
			}
		}
		System.out.println(s1);

	}

}
