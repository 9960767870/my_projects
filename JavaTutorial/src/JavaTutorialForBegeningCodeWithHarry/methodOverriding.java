package JavaTutorialForBegeningCodeWithHarry;

 class A{
	public A() {
		
	}
	
	public void meth2() {
		
		System.out.println("I am method 2 of class A");
		
	}
 }    
	class B extends A{
		public B() {
			super();
		}
			
		public void meth2() {
			
			System.out.println("I am method 2 of class B");
		}
	}


    public class methodOverriding {
    	public static void main(String[] args) {
			
    		A a = new A();
    		a.meth2();
    		
    		B dc = new B();
    		dc.meth2();  
    		
		}
	
	
    }
    
    