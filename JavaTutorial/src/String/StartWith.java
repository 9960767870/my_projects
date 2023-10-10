package String;

public class StartWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abcd";
		
		String s1  = "abcd";
		
		System.out.println(s.startsWith(s1));
		
		if(s1.length()<=s.length()) {
			int diffcount = 0;
			for (int i = 0; i < s1.length(); i++) {
				
				if(s1.charAt(i)!=s.charAt(i)) {
					diffcount++;
				}
			}
				
				if(diffcount>0) {
					System.out.println("false");
				}
				else {
					System.out.println("true");
				}
				
			}
		}

	}


