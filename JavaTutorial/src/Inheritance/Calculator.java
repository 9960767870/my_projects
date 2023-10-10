package Inheritance;

 class Basic{
	 
	 public Basic() {
	System.out.println("This is basic class");
	}
	
	public void add(int a ,int b) {
		
		System.out.println("Add is: "+(a+b));
		
	}
	
	public void sub(int a, int b) {
		System.out.println("Sub is: "+(a-b));
	}
	
}

 class Basic2 extends Basic{
	 
	 public Basic2() {
		
		 System.out.println("This is basic2 class");
	}
	
	 public void mul(int a ,int b) {
			
			System.out.println("Add is: "+(a*b));
			
		}
		
		public void div(int a, int b) {
			System.out.println("Sub is: "+(a/b));
		}
}

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Basic2 b = new Basic2();
		
		System.out.println("This is start method");
		
		b.add(10, 10);
		b.sub(1000, 500);
		b.mul(10, 4);
		b.div(10, 2);

	}

}
