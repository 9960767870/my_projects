   package JavaTutorialForBegeningCodeWithHarry;
  
  //by extends keyword

  class MyThread extends Thread{
	  
	  public void run() {
		  int i = 0;
		  while(i<40) {
		  
		  System.out.println("My coking Thread is Runing");
		  System.out.println("I am so Happy ");
		  i++;
	  }
	  }
  } 
	class MyThread2 extends Thread{
		
		public void run() {
		
		int i = 0;
		while(i<40) {
			System.out.println("Thread2 chatting with her ");
			System.out.println("I am so sad");
			i++;
		}
		}
	}

      public class MultiThreded {
    	  
    	  public static void main(String[] args) {
			
    		  MyThread my = new MyThread();
    		  MyThread2 sc = new MyThread2();
    		  
    		  my.start();
    		  sc.start();
		}
      }


