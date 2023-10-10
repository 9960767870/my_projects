package Inheritance;

class Parent{
	
	int num1;
	int num2;
	
//	public Parent(int num1,int num2) {
//		
//		this.num1 = num1;
//		this.num2 = num2;
//	}
	
	public void sum() {
		System.out.println(num1+" "+num2);
	}
}

class Child extends Parent{
	
	int num3;
	int num4;
	
    
	public Child(int num1,int num2,int num3, int num4) {
//		super(num1,num2);
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.num4 = num4;
	}




	public void add() {
		System.out.println(num3+" "+num4);
	}
}



public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c =new Child(10, 20, 30, 40);
		c.sum();
		c.add();

	}

}
