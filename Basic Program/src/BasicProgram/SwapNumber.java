package BasicProgram;

public class SwapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 100;
		int b = 200;
		
		System.out.println("before swaping");
		System.out.println(a +" "+b);
		
		int temp = a;
		a=b;
		b=temp;
		
		System.out.println("after swaping");
		
		System.out.println(a+ " "+b);

	}

}
