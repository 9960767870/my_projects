package Encapsulation1;

class Student1{
	int age = 21;
	String name = "Rushi";
	int marks = 70;
	
	
	Laptop l = new Laptop();
	Mobile m = new Mobile();
	
}

class Laptop{
	String prosseser = "i7";
	String laptopname = "hp";
	int price = 45000;
	int ram = 8;
}

class Mobile{
	
	String mobilename = "jio";
	int price = 50000;
	int ram = 4;
}

public class Containment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student1 s = new Student1();
		System.out.println(s.age);
	}

}
