package String;

public class indexof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "rushikesh";
		String s2 = "ke";
		
		int obj = s1.indexOf(s2);
		System.out.println(obj);
		
		  int  obj2 = myindexof(s1,s2);
		  System.out.println(obj2);
	}

	private static int myindexof(String s1, String s2) {
		// TODO Auto-generated method stub
		
		
		if(s2.length()==0)
			return 0;
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
					return i;
					
			}
		}
		return -1;
	}

}
