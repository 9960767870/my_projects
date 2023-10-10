package oops;

class Calc{

	
	
	public void add() {
		System.out.println("Enter the add element");
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("Addition:"+c);
		
	}
	
	public void sub() {
		System.out.println("Enter the sub element");
		int x = 100;
		int y = 200;
		int z = x-y;
		System.out.println("Substraction:"+z);
	}
	
	public void mul() {
		System.out.println("Enter the mul element");
		int a = 12;
		int b = 12;
		int c = a*b;
		System.out.println("Multiplication:"+c);
		
	}
	
	public void div() {
		System.out.println("Enter the div element");
		
		int a = 100;
		int b = 10;
		int c = a/b;
		System.out.println("Divition:"+c);
	}
}

public class AddtionSubMulDiv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calc abc = new Calc();
		abc.add();
		abc.sub();
		abc.mul();
		abc.div();
		
	}

}
