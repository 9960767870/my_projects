  package JavaTutorialForBegeningCodeWithHarry;

  //by runnable;

 class MyThreasRunnable1 implements Runnable{
	 
	 public void run() {
		 int a = 0;
		 while(a<4000) {
			 
			 System.out.println("Mythread1 is Runnable");
			 a++;
		 }
		 
	 }
 }
	 
	 class MyThreadRunnable2 implements Runnable{
		 
		 public void run() {
			 int a = 0;
			 while(a<4000) {
				 System.out.println("MyThread2 is Runnable");
				 a++;
			 }
		 }
	 }
	 
	
      public class MultiThreaded_Runnable {
    	  
    	  public static void main(String[] args) {
			
    		  
    		  MyThreasRunnable1 bullet1 = new MyThreasRunnable1();
    		  Thread gun1 = new Thread(bullet1);
    		  
    		  MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
    		  Thread gun2 = new Thread(bullet2);
    		  
    		  gun1.start();
    		  gun2.start();
		}    
      }


