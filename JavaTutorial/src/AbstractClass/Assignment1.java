package AbstractClass;

abstract class Shape{
	
	public abstract void numberOfSides(); 
	
}

class  Trapezoid extends Shape{

	@Override
	public void numberOfSides() {
		
		int a = 4;
		int b = 5;
		int h = 10;
		
		int sum = a+b/2*h;
		System.out.println(sum);
	}
}
	
	class Triangle extends Shape{

		@Override
		public void numberOfSides() {
			
			int b = 10;
			int h = 8;
			int area = (b*h)/2;
			System.out.println(area);
		}
		
		
	}
	
	class  Hexagon extends Shape{

		@Override
		public void numberOfSides() {
		
		double a =3;
		double b = 2;
		double c = 0.5;
		
		double area = (a*b)*c;
		System.out.println(area);
	
			
		}
		
	}
	
	


public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Trapezoid t = new Trapezoid();
		t.numberOfSides();
		
		Triangle a = new Triangle();
		a.numberOfSides();
		
		Hexagon h = new Hexagon();
		h.numberOfSides();
	}

}
