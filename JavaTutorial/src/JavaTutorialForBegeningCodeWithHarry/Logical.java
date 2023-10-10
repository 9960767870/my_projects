package JavaTutorialForBegeningCodeWithHarry;

public class Logical {
	public static void main(String[] args) {
		System.out.println("for logical AND");
		boolean a = true;
		boolean b = true;
		
		if(a && b) {
			
			System.out.println("yes");
		}
		
		else {
			
			System.out.println("no");
		}
		 
		
		System.out.println("for logical OR");
		
		if(a||b) {
			
			System.out.println("yes");
		}
		
		else {
			
			System.out.println("no");
			
		
		}
		
		System.out.println("for logical NOT");
		
		System.out.print("Not(a) is ");
		System.out.println(!a);
		
		System.out.print("Not(b) is ");
		System.out.println(!b);
	}

}
