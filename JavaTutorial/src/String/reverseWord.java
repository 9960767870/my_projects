package String;

public class reverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = ("You all very good students");
		
		String[] s1 = s .split(" ");
		
		for (int i = 0; i < s1.length; i++) {
			System.out.print(s1[i]+" ");
		}
		System.out.println();
		
		for (int i = 0; i < s1.length; i++) {
			 String s2 = s1[i];
			 
			 char[] c = s2.toCharArray();
			 
			 int p = 0;
			 int q = c.length-1;
			 
			 while(p<q) {
			 char ch = c[p];
			 c[p] = c[q];
			 c[q] = ch;
			 p++;
			 q--;
			 
		}
			 String s4 = new String(c);
			 s1[i]=s4;

	}
		
		for (int i = 0; i < s1.length; i++) {
			System.out.println(s1[i]+" ");
		}

}
}
