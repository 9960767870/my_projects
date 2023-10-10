package Constructor;

public class Collage {
	
	int num1 = 100;
	
	public static void add() {
		
		System.out.println("It is outer class");
	}
	
	class Department {
		int num2 = 200;
		
		public void sum() {
		System.out.println(num1);
		System.out.println(num2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collage c = new Collage();
		
		Collage.Department d = c.new Department();
		d.sum();
		add();
		
	}

}
