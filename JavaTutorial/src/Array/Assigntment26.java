package Array;

public class Assigntment26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] s1 = {'a','b','c','d','e'};
		
		char[] s2 = {'x','y','z'};
		
		char[] s3 = new char[s1.length+s2.length];
		
		int index = 0;
		for (int i = 0; i < s3.length; i++) {
			
			if(i<s1.length) {
				       s3[index++]=s1[i];
			}
			if(i<s2.length) {
				s3[index++]=s2[i];
			}
			
		}
		for (int i = 0; i < s3.length; i++) {
			System.out.print(s3[i]+" ");
		}
	}

}
