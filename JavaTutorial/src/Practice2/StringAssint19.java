package Practice2;

public class StringAssint19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		String s = "abbccddee";
		
		String unique ="";
		
		for (int i = 0; i < s.length(); i++) {
			
			int diffcount = 0;
			for (int j = 0; j < i; j++) {
				
				if(s.charAt(i)==s.charAt(j))
				{
					diffcount++;
				}
			}
			
			if(diffcount==0)
			{
				unique = unique+s.charAt(i);
			}
		}
		System.out.println(unique);
	}

}
