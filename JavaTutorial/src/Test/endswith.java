package Test;

public class endswith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "rushi";
		String s1 = "hi";
		
		for (int i = 0; i < s1.length(); i++) {
			
			int p = s.length()-1;
			int q = s1.length()-1;
			
			while(q>=0)
			{
				if(s.charAt(i)!=s1.charAt(i)) {
				p--;
				q--;
			}
			}
			if(q>0)
			{
				System.out.println(false);
			}
			else {
				System.out.println(true);
			}
		}
	}

}
