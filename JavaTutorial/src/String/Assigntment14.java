package String;

public class Assigntment14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "12a34";
		
		int nondigitcount = 0;
		
		for (int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				
			}
			else {
				nondigitcount++;
				break;
			}
		}
			if(nondigitcount>0) {
				System.out.println("notonlydigits");
			}
			else {
				System.out.println("onlydigit");
			}
		}
	}


