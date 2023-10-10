
public class Upercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "rushi bhosale";
		
		char[]  ch= s.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			
			if(ch[i]=='r')
				ch[i]='R';
			
			else if(ch[i]=='b')
				ch[i]='B';
		}
		   s = new String(ch);
		   System.out.println(s);

	}

}
