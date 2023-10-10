package String;

public class Assint1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="abcdabcdacd";
		
		String unique="";
		
		for (int i = 0; i <s.length(); i++) {
			int samecount=0;
			for (int j = 0; j <i; j++) {
				
				if(s.charAt(i)==s.charAt(j))
				{
					samecount++;
					break;
				}
			}
			
			if(samecount==0)
				unique = unique+s.charAt(i);
		}
		
		System.out.println(unique);
	}

}
