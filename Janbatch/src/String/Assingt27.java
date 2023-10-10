package String;

public class Assingt27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String s = "         rushikesh    bhosale         ";
		 
	 s=s.trim();
		 String s1 = "";
		 
		 for (int i = 0; i <s.length(); i++) {
			
			 
			 if(s.charAt(i)==' ' && s.charAt(i+1)==' ')
			 {
				 
			 }
			 else
			 {
				 s1=s1+s.charAt(i);
			 }
		}
		 
		 System.out.println(s1);
	}

}
