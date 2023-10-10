package Inheritance;

class Demo{
	
	public void add1(int a,int b) {
		System.out.println("add "+(a+b));
	}
}

class Demo2 extends Demo{
	
	public void sub1(int a,int b) {
		System.out.println("sub "+(a-b));
	}
}

class Demo3 extends Demo{
	
	public void mul(int a,int b) {
		System.out.println("mul "+(a*b));
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		
		Demo2 d1 = new Demo2();
		d1.add1(10, 10);
		d1.sub1(10, 2);
		
		
		Demo3 d = new Demo3();
		d.mul(10, 10 );
		
		
		

	}

}
