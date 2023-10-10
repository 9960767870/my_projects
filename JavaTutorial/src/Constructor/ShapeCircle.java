package Constructor;

public class ShapeCircle {
	
	float pi = 3.5f;
	float redius;
	
	public ShapeCircle(float radius) {
		this.redius = radius;
		System.out.println("redius is:"+redius);
		
	}
	
	

	public ShapeCircle(float pi, float redius) {
		this(6);
		this.pi = pi;
		this.redius = redius;
		System.out.println("redius is:"+redius);
		System.out.println("pi is:"+pi);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ShapeCircle s = new ShapeCircle(15.4f);
		ShapeCircle s1 = new ShapeCircle(5, 3.14f);
		
		
		
	}

}
