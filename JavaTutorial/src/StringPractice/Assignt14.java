package StringPractice;

public class Assignt14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "1234";
		
		int nondigitcount = 0;
		for (int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i)<'0' || s.charAt(i)>'9')
			{
				nondigitcount++;
				break;
			}
		}
			if(nondigitcount==0)
			{
				System.out.println("onlydigitcount");
			}
			else {
				System.out.println("notonlydigitcount");
			}
	}

}
