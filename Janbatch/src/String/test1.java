package String;

public class test1 {

	public static void main(String[] args) {
		
	 String s = "4321";
	 
	
	 
	 char[] ch = s.toCharArray();
	 int i=0;
	 
	 
	 s = new String(ch);
	 System.out.println(s);
	 
	 loopi(ch,s,i);
		

	}

	private static void loopi(char[] ch, String s, int i) {
		int j=i+1;
		if(i<ch.length)
		{
			loopj(ch,s,i,j);
			loopi(ch, s, i+1);
		}
		
	}

	private static void loopj(char[] ch, String s, int i, int j) {
		
		if(j<ch.length)
		{
			if(ch[i]>ch[j])
			{
				char v = ch[i];
				ch[i]=ch[j];
				ch[j]=v;
				 loopj(ch, s, i, j+1);
			}
			
			 
			
		}
		
	}
}

