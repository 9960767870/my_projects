package Constructor;

public class Circle {
	float pi =3.14f;
	int redius;
	
	public void calculate(float redius) {
		
		float a = pi*redius*redius;
		System.out.println(a);
		
	}
	
	public void circumference(float redius) {
		
		float b = 2*pi*redius;
		System.out.println(b);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle c = new Circle();
		c.calculate(10);
		c.circumference(4);
	}

}
