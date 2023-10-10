package StringPractice;

public class reverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "i an very good boy";
		String[] s1 = s.split(" ");
		
		for (int i = 0; i < s1.length; i++) {
			System.out.println(s1[i]);
		}
		
		for (int i = 0; i < s1.length; i++) {
			      String s3=s1[i];
			 char[] ch = s3.toCharArray();
			  
			 int p=0;
			 int q = ch.length-1;
			 
			 while(p<q)
			 {
				 char c = ch[p];
				 ch[p] = ch[q];
				 ch[q] = c;
				 p++;
				 q--;
			 }
			 
			 String s4 = new String(ch);
			             s1[i]=s4;
		}
		for (int i = 0; i < s1.length; i++) {
			System.out.print(s1[i]+" ");
		}
	}

}
