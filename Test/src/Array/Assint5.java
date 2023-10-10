package Array;

public class Assint5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] s1 = {'a','b','c','d'};
		char[] s2 = {'w','x','y','z'};
		
		char[] s3 = new char[s1.length+s2.length];
		int index=0;
		 
		 for (int i = 0; i < s3.length; i++) 
		 {
			 if(i<s1.length)
			 {
				       s3[index++]=s1[i];
			
		     }
			 if(i<s2.length)
			 {
				 s3[index++]=s2[i];
			 }
		
				}
		 
		 for (int i = 0; i < s3.length; i++) {
			System.out.println(s3[i]+" ");
		}
		}

}
