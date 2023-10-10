package Second;

public class Calculator {
	
	public int add(int a,int b) {
		int sum = a+b;
		System.out.println(sum);
		return sum;
		
	}
	
	public int sub(int a,int b) {
		int c = a-b;
		System.out.println(c);
		return c;
	}
	
	public int mul(int a,int b) {
		int c =a*b;
		System.out.println(c);
		return c;
	}
	
	public int div(int a,int b) {
		int c = a/b;
		System.out.println(c);
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Calculator c = new Calculator();
 c.add(10, 10);
 c.sub(10, 2);
 c.mul(12, 2);
 c.div(12, 2);
		
	}

}
