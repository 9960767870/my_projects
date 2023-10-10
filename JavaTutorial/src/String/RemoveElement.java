package String;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Rushidkesh";
		String s1 = "";
		
		for (int i = 0; i <s.length(); i++) {
			
			if(s.charAt(i)!='d') {
			s1 = s1 + s.charAt(i);
		}
			

	}
		System.out.println(s1); 
	}
}


