package First;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "rushi";
		
		//String s1 = "";
		
		char[] s1 = s.toCharArray();
		
		for (int i =  s1.length-1; i>=0; i--) 
		{
			 System.out.println(s1[i]);
		}

	}

}
