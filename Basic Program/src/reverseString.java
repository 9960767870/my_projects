
public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Rushikesh";
		String s3 ="";
		//char[] s1 = s.toCharArray();
		
		for (int i =s.length()-1; i>=0; i--) {
			
		s3 = s3+s.charAt(i);
			
		}
		s=s3;
		System.out.println(s);
		
		
		String a = "rushi bhosale";
		String a1 = " ";
		
		String[] a2 = a.split(" ");
		
		for (int i =a2.length-1; i>=0; i--)
		{
			a1 = a1+a2[i]+" ";
		}
		a=a1;
		System.out.println(a);
	}

}
