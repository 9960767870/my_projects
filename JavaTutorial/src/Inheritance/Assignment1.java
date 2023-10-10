package Inheritance;

class Test1{
	
	int num1;
	int num2;
	
}

class Test2 extends Test1{
	
	int num3;
	
	public Test2(int num1,int num2,int num3) {
		
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}
	
	public void display() {
	System.out.println(num1+" "+num2+" "+num3);
}
}

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test2 t = new Test2(10, 20, 30);
		t.display();
	}

}
