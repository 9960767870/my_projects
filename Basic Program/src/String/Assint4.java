package String;

public class Assint4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "ABCD";
		
		char[] ch = s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			
			if(ch[i]>='A' && ch[i]<='Z')
			{
				int num=ch[i];
				int num2=num+32;
				char ca = (char) num2;
				  ch[i]=ca;
			}
		}
			String s2 = new String(ch);
			System.out.println(s2);
		 
	}

}
