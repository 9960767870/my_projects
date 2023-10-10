package HefShineTutorial;

public class StaticKeyword {
//	Statickeyword used in four type
//	static variable
//	static method
//	static block 
//	static class 
	
//	static variable
	static int x=1000 ;
	
	static void display() {
		System.out.println("The value of x is"+x);
		
	}
	
//	static method
	static void show() {
		System.out.println("The value of show method is");
	}
	
//	static block 
	static {
		
	}
	
//	static class
	
	
	

	public static void main(String[] args) {
		
    StaticKeyword sc = new StaticKeyword();
    sc.display();
//    int x=29;
    show();
	}

}
