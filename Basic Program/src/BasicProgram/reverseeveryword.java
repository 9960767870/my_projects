package BasicProgram;

import java.util.Arrays;

public class reverseeveryword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="hey,rushi,hello";
		
		String s1[]=s.split(",");
		for (int i = 0; i < s1.length; i++) {
			String e=s1[i];
			
			char z[]=e.toCharArray();
			int k=0;
			int j=z.length-1;
			while(j>i)
			{
				char r=z[k];
				z[k]=z[j];
				z[j]=r;
				k++;
				j--;
			}
			//System.out.println(Arrays.toString(z));
			
			s1[i] = new String(z);
		}
		System.out.println(Arrays.toString(s1));
		System.out.println(s);
	
		
	}

}
