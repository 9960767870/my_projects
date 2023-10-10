package String;

public class Assint3 {

	public static void main(String[] args) {
		
     String s = "abcd";
     
     
   
		
    		char [] ch = s.toCharArray();
    		
    		for (int i = 0; i < ch.length; i++) {
    			
    			if(ch[i]>='a' && ch[i]<='z')
    			{
    				int num=ch[i];
    				int num2 = num-32;
    				char ca = (char) num2;
    				   ch[i]=ca;
    			}
    		}
    		
    		String s4 = new String(ch);
    		System.out.println(s4);
	}

}
