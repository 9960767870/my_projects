package HefShineTutorial;
class A{
	void show() {
		System.out.println("This is A method");
	}
}

class B extends A{
	void show() {
		System.out.println("This is B method ");
	}
}

public class Override {
	
	public static void main(String[] args) {
//		A a = new A();
//		a.show();
		
		 B b = new B();
		 b.show();
		
		

	}

}
