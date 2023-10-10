package String;

public class Trim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "          ru  shi             ";
		
		System.out.println(s1.trim());
		
		       String obj = myTrim(s1);
				
	     System.out.println(obj);
	
	}

	private static String myTrim(String s1) {
	
		 
		 int i=0;
		 
		 while(s1.charAt(i)==' ')
		 {
			 i++;
		 }
		 
		 int j=s1.length()-1;
		 
		 while(s1.charAt(j)==' ')
		 {
			 j--;
		 }
		 
		 String s2 = "";
		 
		 for (int k = i; k <=j; k++) {
			
			 s2=s2+s1.charAt(k);
		}
		 return s2;
		    
	
	}

}
