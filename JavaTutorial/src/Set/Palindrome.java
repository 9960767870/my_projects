package Set;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int r,Sum=0,temp;
		
		int n = 454;
		
		temp = n;
		
		while(n>0) {
			
			r = n%10;
			
			Sum = (Sum*10)+r;
			
			n = n/10;
			
		}
		
		if(Sum==temp) {
			
			System.out.println("number is palindrome");
		}
		else {
			System.out.println("number is not palindrome");
		}

	}

}
