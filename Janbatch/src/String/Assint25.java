package String;

public class Assint25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		 String s = "abcd";
		 String s1="";
		 
		 for (int i = 0; i <s.length(); i++) {
			
			 char ch = s.charAt(i);
			 s1=s1+ch+ch;
		}
		 System.out.println(s1);
		 
	}

}
