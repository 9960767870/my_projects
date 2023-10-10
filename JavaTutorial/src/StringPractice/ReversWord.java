package StringPractice;

public class ReversWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "you are good boy";
		String[] s1 = s.split(" ");
		
		for (int i = 0; i < s1.length; i++) {
			System.out.println(s1[i]);
		}

		for (int i = 0; i < s1.length; i++) {
			     String s3 = s1[i];
			     
			     char[] c = s3.toCharArray();
			     
			     int p = 0;
			     int q = c.length-1;
			     
			     while(p<q)
			     {
			    	 char ch = c[p];
			    	 c[p] = c[q];
			    	 c[q] = ch;
			    	 p++;
			    	 q--;
			     }
			     
			     String s4 = new String(c);
			               s1[i]= s4;
		}
		for (int i = 0; i < s1.length; i++) {
			System.out.print(s1[i]+" ");
		}
	}

}
