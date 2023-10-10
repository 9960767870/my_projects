package Second;

public class Overloading {
	
	public void add(int length,int width) {
		System.out.println("area of rectangle");
		System.out.println(length*width);
		
		
	}
	
	public void add(int a,int b,int c) {
		System.out.println("area of triangle");
		System.out.println((a+b+c)/2);
	}
	
	public void add(int a) {
		System.out.println("area of square");
		System.out.println(a*a);
	}
	
	

	public static void main(String[] args) {
	
		Overloading o = new Overloading();
		o.add(10, 10);
		o.add(19, 12, 14);
		o.add(10);

	}

}
