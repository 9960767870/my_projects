package String;

public class Assignment15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "12a34";
		
		int sum = 0;
		
		for (int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				
				sum = sum + s.charAt(i)-48;  //asky value 0 is 48;
 			}
			
		}
		System.out.println(sum);

	}

}
