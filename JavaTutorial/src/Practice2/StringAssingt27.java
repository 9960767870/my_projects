package Practice2;

public class StringAssingt27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "        rushi           ";
		
		 s = s.trim();
		
		String s1 = "";
		for (int i = 0; i <s.length(); i++) {
			
			if(s.length()==' '  && s.charAt(i+1)==' ')
			{
				
			}
			else
			{
				s1 = s1+s.charAt(i);
			}
		}
		System.out.println(s1);
		
	}

}