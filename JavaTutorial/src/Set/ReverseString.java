package Set;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		String s = "RushiBhosale";
		
		String str = " ";
		
		for(int i=s.length()-1;i>=0;i--) {
			
			str = str+s.charAt(i);
		}
		System.out.println("Orignal String:"+s);
		
		System.out.println("Reverse String:"+str);
		

	}

}
