package BasicProgram;

public class Assint7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "ababcdcd";
		String s1="";
		
		int cnt=0;
		for (int i = 0; i < s.length(); i++) {
			
			for (int j = i+1; j <s.length(); j++) {
				
				if(s.charAt(i)==s.charAt(j))
				{
					cnt++;
				  s1=s1+s.charAt(i);
				  break;
				}
			}
		}
		
		System.out.println(s1);
		System.out.println(cnt);
	}

}
