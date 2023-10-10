package String;

public class StringAsingt16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abbccdde";
		String s1 = "";
		
		int diffcount = 0;
		for (int i = 0; i < s.length(); i++) {
			
			for (int j = i+1; j < s.length(); j++) {
				
				if(s.charAt(i)==s.charAt(j))
				{
					diffcount++;
					s1 = s1+s.charAt(i);
					break;
				}
			}
		}
		System.out.println(diffcount);
		System.out.println(s1);
		
	}

}
