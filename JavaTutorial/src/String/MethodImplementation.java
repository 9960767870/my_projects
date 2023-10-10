package String;

import java.util.Arrays;

public class MethodImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Rushi";
		
		char[] a = s.toCharArray();
		
		System.out.println(Arrays.toString(a));
		
		char[] aa = new char[s.length()];
		
		for (int i = 0; i < s.length(); i++) {
		
			aa[i]=s.charAt(i);
		}
		System.out.println(Arrays.toString(aa));
//		for (int i = 0; i < aa.length; i++) {
//			System.out.print(aa[i]);
//		}
		

	}

}
