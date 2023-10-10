 package Practice_Set;

 public class methodOverloading_Example {
	 /*
	 
	 public void meth1() {
		 System.out.println("This is meth1");
	 }
	 
	 public void meth2() {
		 System.out.println("This is meth2");
	 }
	 
	 public void meth3() {
		 System.out.println("This is meth3");
	 }
	 */
	
     
	 
	 
	 public void method1() {
		 System.out.println("inside single argument method1");
		 
	 }
	 
	 public void method1(int a,int b) {
		 System.out.println("inside integer argument  method1 : "+a+" "+b);
	 }
	 
	 public void method1(String paraString, boolean parabool ) {
		 System.out.println("inside the argument method1 : "+paraString +" "+parabool);
		 
	 }
		 
	 public static void main(String[] args) {
			
		 methodOverloading_Example mc = new methodOverloading_Example();
		  
		 mc.method1("rushi",true);
	 }
 }