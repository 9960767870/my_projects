package String;

public class Assignment16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "aabbbcc";
		String s1 = "";
		
		int duplicatecount = 0;
		
		for (int i = 0; i <s.length(); i++) {
			for (int j = i+1; j < s.length(); j++) {
			
			if(s.charAt(i)==s.charAt(j)) {
				duplicatecount++;
				s1 = s1+s.charAt(i);
				break;
				
			}
		}

	}
		System.out.println(duplicatecount);
		System.out.println(s1);

}
}
