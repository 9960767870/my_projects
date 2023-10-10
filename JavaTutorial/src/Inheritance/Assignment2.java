package Inheritance;

class Test{
	
	public void display() {
		System.out.println("GoodMorning");
	}
	
	public void display2() {
		System.out.println("GoodAfternoon");
	}
}

class TestingInheritance extends Test{
	
	public void display3() {
		System.out.println("GoodEvening");
	}
}

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestingInheritance t = new TestingInheritance();
		t.display();
		t.display2();
		t.display3();
		
	}

}
