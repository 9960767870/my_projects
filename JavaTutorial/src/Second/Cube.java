package Second;

public class Cube {
	int heigth = 10;
	int width = 20;
	int depth = 30;
	
	public void calculateValume() {
		System.out.println(heigth*width*depth);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cube c = new Cube();
		c.calculateValume();
		
	}

}
