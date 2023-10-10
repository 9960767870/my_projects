package String;

public class ContainsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "rushikesh";
		String s2 = "shi";
		
		System.out.println(s1.contains(s2));
		
		   boolean mylist = myContains(s1,s2);
		   System.out.println(mylist);
	}

	private static boolean myContains(String s1, String s2) {
		
		if(s2.length()==0)
			return true;
		
		for (int i = 0; i <s1.length(); i++) {
			
			if(s1.charAt(i)==s2.charAt(0))
			{
				int j=i;
				int k=0;
				int similarcount=0;
				
				while(k<s2.length() && j<s1.length())
            {
					
	    if(s1.charAt(j)==s2.charAt(k))
		similarcount++;
	   else
		break;
	   j++;
	    k++;
           }
				if(similarcount==s2.length())
					return true;
          }
			
			}
		return false;
		
           }

}
