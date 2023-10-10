package Constructor;

class cal{
	
	int num1;
	int num2;
	
	public cal() {
		
	}
	
    public cal(int a,int b) {
    	
    	 num1 = a;
    	num2 = b;
		
	}
    
    public void add() {
    	int num3 = num1+num2;
    	System.out.println(num3);
    	
    }
	
	
}

public class MyClass2 {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
	
		cal c = new cal(a,b);
		c.add();

	}

}
