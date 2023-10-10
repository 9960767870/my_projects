package String;

public class Trimmethodspacecount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "                  rushibhosale                  ";
		
		int leadingspacecount=0;
		int treillingspacecount=0;
		
		int i=0;
		
		while(s.charAt(i)==' ')
		{
			leadingspacecount++;
			i++;
		}
		
		i=s.length()-1;
		
		while(s.charAt(i)==' ')
		{
			treillingspacecount++;
			i--;
		}
		
		System.out.println("leadingcount :"+leadingspacecount);
		System.out.println("treillingcount :"+treillingspacecount);
	}

}
