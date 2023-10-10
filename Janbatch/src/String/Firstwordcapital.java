package String;

public class Firstwordcapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "you are good boy";
		
		char[] s1 = s.toCharArray();
		
		for (int i = 0; i < s1.length; i++) 
		{
			if(i==0 && s1[i]>='a' && s1[i]<='z')
			{
				int num = (int)s1[i];
				num = num-32;
				char ch = (char) num;
				s1[i]=ch;
			}
			
			else if(s1[i]==' ' && s1[i+1]>='a' && s1[i]<='z')
			{
				  int num =(int)s1[i+1];
				  num = num-32;
				  char ch =(char) num;
				    s1[i+1]=ch;
				 
			}
			
		}
		 s = new String(s1);
		 System.out.println(s);
		

	}

}
