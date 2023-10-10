package JavaTutorialForBegeningCodeWithHarry;
 
 interface SampleInterface{
	 void math1();
	 void math2();
 }
 
 interface ChaildInterface extends SampleInterface{
	 void math3();
	 void math4();
 }
  
 class SampleClass implements ChaildInterface{
	 
	 public void math1() {
		 System.out.println("Math1");
	 }
	 public void math2() {
		 System.out.println("Math2");
	 }
	 public void math3() {
		 System.out.println("Math3");
	 }
	 public void math4() {
		 System.out.println("Math4");
	 }
 }
 

  public class Inheritance_Interface {
	  
	  public static void main(String[] args) {
		  
	  SampleClass obj = new SampleClass();
	  
      obj.math1();
	  obj.math2();
	  obj.math3();
	  obj.math4();
  
}
}