package Inheritance;

class p{
	
	public static void add(int a,int b) {
		System.out.println("This is parent method");
		System.out.println("add is: "+(a+b));
	}
}

class q extends p{
	public static void add(int a,int b) {
		System.out.println("This is child method");
		System.out.println("add is: "+(a+b));
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		q obj = new q();
		obj .add(10, 10);
		
	}

}
