package Test;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "rushikesh";
		String ss = "";
		
		for (int i = 0; i <s.length(); i++) {
			
			char[] c = s.toCharArray();
			int  p =0;
			int q = c.length-1;
			
			while(p<q)
			{
	         
				char sss = c[p];
				c[p] = c[q];
				c[q] = sss;
				p++;
				q--;
			}
			
			ss = ss+s.charAt(i);
			ss = new String(c);
		}
		System.out.println(ss);
	}

}
