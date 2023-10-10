package StringPractice;

public class upperlower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abcd";
		
		String ss = "ABCD";
	
		for (int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i)!=ss.charAt(i))
			{
			               s=ss;   
				       
			}
		}
		System.out.println(s);
		
		String s1 = "ABCD";
		String s2 = "abcd";
		
		for (int i = 0; i <s1.length(); i++) {
			
			if(s1.charAt(i)!=s2.charAt(i))
			{
				            s1=s2;
			}
		}
		System.out.println(s1);
		
		
	

	}

}
