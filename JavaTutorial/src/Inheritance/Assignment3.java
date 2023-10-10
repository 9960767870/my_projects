package Inheritance;

class W{
	
	public void display() {
		System.out.println("GoodMorning");
	}
	
	public  void display1() {
		System.out.println("GoodAfternoon");
	}
}

class M extends W{
	
	public void display() {
		System.out.println("GoodEvening");
	}
	
	public  void display1() {
		System.out.println("good");
	}
}
public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		M m = new M();
		m.display();
		m.display1();

	}

}
