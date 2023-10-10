
public class RecurtionUsingString {

	static String s = "1234";
	
	static int digitcount = 0;
	
	public static void main(String[] args) {

		number(0);
		if(digitcount>0)
	    {
	    	System.out.println("notdigit");
	    }
	    else
	    {
	    	System.out.println("onlydigit");
	    }
		  

	}

	private static void number(int i) {

    if(i<s.length())
    {
    	if(s.charAt(i)>='0' && s.charAt(i)<='9')
    	{
    		
    	}
    	else
    	{
    		digitcount++;
    		
    	}
    	number(i+1);
    	
    }
    
    


	}

}
