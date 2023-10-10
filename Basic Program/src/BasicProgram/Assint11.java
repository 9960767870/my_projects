package BasicProgram;

public class Assint11 {

	public static void main(String[] args) {
		
		String s = "abcdabcd";
		String s1="";
		
		
		for (int i = 0; i <s.length(); i++) {
			int cnt=0;
			for (int j = i+1; j <s.length(); j++) {
				char ch = s.charAt(j);	
				
				
				if(s.charAt(i)==s.charAt(j))
				{
					cnt++;
					s1=s1+s.charAt(i);
					break;
				}
			}
			
		}
		
		  int count=0;
		 
		for (int i = 0; i <s1.length(); i++) {
			
			for (int j = 0; j < s1.length(); j++) {
				 char ch = s1.charAt(j);		
				
				if(s1.charAt(i)==s1.charAt(j))
				{
					count++;
					break;
				}
				System.out.println(ch+" "+count);
			}
			
			
		}

	}

}
