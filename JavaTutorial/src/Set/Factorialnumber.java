package Set;

public class Factorialnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r;
		int fact = 1;
		
		int number = 5;
		
		for(int i=1;i<=number;i++) {
			r = i;
			fact = fact*r;
			
		}
		System.out.println("Factorial of "+number +"is:"+fact);
		
		

	}

}
