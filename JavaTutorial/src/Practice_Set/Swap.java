package Practice_Set;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 100;
		int y = 200;
		
		System.out.println("Before Swap");
		System.out.println("x:"+x);
		System.out.println("y"+y);

		
		int temp = x;
		x = y;
		y = temp;
		
		System.out.println("After Swap");
		System.out.println("x:"+x);
		System.out.println("y"+y);
	}

}
