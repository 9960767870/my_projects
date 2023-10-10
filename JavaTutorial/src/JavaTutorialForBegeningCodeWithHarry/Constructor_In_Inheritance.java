package JavaTutorialForBegeningCodeWithHarry;


class base{
	base(){
		System.out.println("i am Constructor class");
	}
	
	base(int x){
		System.out.println("base overloaded Constructor with value of x " + x);
	}
	

}	

		
class derived extends base{
	
	derived(){
		//super(0)
		System.out.println("i am derive Constructor class");
		
	}
	
	
	derived(int x,int y){
		super(x);
		System.out.println("derive overloaded  Constructor with value of y"+y);
	}
	
} 


       public class Constructor_In_Inheritance {
       public static void main(String[] args) {
    	   base b = new base();
    	   derived d = new derived(19,2);
    	   
	
}
}
