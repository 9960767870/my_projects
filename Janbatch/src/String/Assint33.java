package String;

public class Assint33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "4321";
		
		char[] ch = s.toCharArray();
		 for (int i = 0; i < ch.length; i++) {
			
			 for (int j =i+1; j < ch.length; j++) {
				
				 if(ch[i]>ch[j])
				 {
					 char temp =ch[i];
					 ch[i]=ch[j];
					 ch[j]=temp;
				 }
			}
		}
		 s=new String(ch);
		 System.out.println(s);
	}

}
