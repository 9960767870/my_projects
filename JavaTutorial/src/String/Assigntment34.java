package String;

import java.util.Arrays;

public class Assigntment34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String s = "i am very good student";
		String[] ss = s.split(" ");
	
		for (int i = 0; i < ss.length; i++) {
			
			for (int j = i+1; j < ss.length; j++) {
				
				if(ss[i].length()>ss[j].length()) {
					
					String sss = ss[i];
					ss[i] = ss[j];
					ss[j] = sss;
				
			}
			              
			}
		}
			
			System.out.println(ss[0]);
			System.out.println(ss[ss.length-1]);
				
			}
	}


