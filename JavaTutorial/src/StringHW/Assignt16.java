package StringHW;

public class Assignt16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "aabbccdd";
		String s1 = "";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			
			for (int j = i+1; j < s.length(); j++) {
				if(s.charAt(i)==s.charAt(j)) {
					
					s1 = s1+s.charAt(j);
					count++;
					
				}
				
			}
			
		}
		
		System.out.println(s1+" ");
		System.out.println(count);
	}

}
