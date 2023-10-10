package JavaTutorialForBegeningCodeWithHarry;
 
 class Thr extends Thread{
	 
	 Thr(String name){
		 super(name);
			 
		 }
	 
	 public void run() {
		 int i = 0;
		 
		System.out.println("I am thread") ;
		 
	 }
 }

  public class Constructor_Thread {
	
   public static void main(String[] args) {
	   
	   Thr th1 = new Thr("Rushi");
	   Thr th2 = new Thr("Bhosale");
	   
	   th1.start();
	   th2.start();
	   
	   System.out.println("The id of Thread t1 is : " + th1.getId());
	   System.out.println("The name of Thread t1 is:"+th1.getName());
	   
	   System.out.println("The id of Thread t2 is : " + th2.getId());
	  System.out.println ("The id of Thread t1 is : " + th2.getName());
	   
	
}
}
