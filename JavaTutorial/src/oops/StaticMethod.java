package oops;

public class StaticMethod {
	
	static int num = 100;
	
	public static void print() {
		 System.out.println(num);
	}

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
        StaticMethod.num=200;
		StaticMethod.print();
		
	}

}
