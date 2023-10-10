package String;

public class Wordreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String s = "you are good student";
		 
		 String[] s1 = s.split(" ");
		 
		 for (int i = 0; i<s1.length; i++) {
			 
			 String s2 = s1[i];
			 String s3 ="";
		 
		 for (int j = s2.length()-1; j>=0; j--) {
		
			 s3 = s3+s2.charAt(j);
		}
		  s1[i]=s3;
		 }
		 
		 for (int i = 0; i < s1.length; i++) {
			System.out.println(s1[i]);
		}
		
	 
	}

}
