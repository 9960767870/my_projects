package String;

public class EndsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "abcd";
		String s2 = "cd";
		
		System.out.println(s1.endsWith(s2));
		
		if(s2.length()<=s1.length()) {
			int i = s1.length()-1;
			int j = s2.length()-1;
			
			while(j>=0) {
				
				if(s1.charAt(i)!=s2.charAt(j)) 
					 
					break;
					i--;
					j--;
				
			}
			if(j>0) {
				System.out.println("false");
			}
			else {
				System.out.println("true");
			}
		}

	}

}
