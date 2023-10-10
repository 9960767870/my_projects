package Constructor;

public class Rectangle1 {
	
	int length;
	int breadth;
	
	public void calculate() {
		int num = length*breadth;
		System.out.println(num);
	}
	
	public Rectangle1() {
		System.out.println(length+" "+breadth);
		
	}
	
	

	public Rectangle1(int length, int breadth) {
		
		this.length = length;
		this.breadth = breadth;
	}
	
	public Rectangle1(int num) {
		
		this.length = num;
		this.breadth = num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle1 r = new Rectangle1();//deflault constructor
		
		Rectangle1 r1 = new Rectangle1(10, 10);
		r1.calculate();
		
		Rectangle1 r2 = new Rectangle1(100);
		r2.calculate();
	}

}
