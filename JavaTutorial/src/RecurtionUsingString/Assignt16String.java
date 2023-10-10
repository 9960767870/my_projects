package RecurtionUsingString;

public class Assignt16String {

	static String s1 = "aabbcc";
	static String s2 = "";
	static int duplicatecount = 0;
	public static void main(String[] args) {
           
		loopi(0,0);
		
        System.out.println(duplicatecount);
        System.out.println(s2);

	}
	private static void loopi(int i,int j) {
     
		j = i+1;
      if(i<s1.length())
      {
    	   loopj(i,j);
    	  loopi(i+1,j);
      }
  	
	}
	private static void loopj(int i, int j) {
		// TODO Auto-generated method stub

		if(j<s1.length())
		{
			
			if(s1.charAt(i)==s1.charAt(j))
			{
				duplicatecount++;
				s2 = s2+s1.charAt(i);
				
			}
			loopj(i, j+1);
		}
	}

}
