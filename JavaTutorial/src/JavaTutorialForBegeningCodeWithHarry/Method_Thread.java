package JavaTutorialForBegeningCodeWithHarry; 

  class MyNewThr extends Thread{
	  
	  public void run() {
		  int a = 0;
		  while(true) {
			  System.out.println("My Thread");
			  
			  a++;
			  
			  try {
				Thread.sleep(455);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  
		  }
	  }
  }
	  
	  class MyNewThr2 extends Thread{
		   
		  public void run() {
			  int a = 0;
			  while(true) {
				  System.out.println("This is my new thread");
				  a++;
			  }
		  }
	  }
  
  

    public class Method_Thread {
    	public static void main(String[] args) {
    		MyNewThr t1 = new MyNewThr();
    		MyNewThr t2 = new MyNewThr();
    		
    		t1.start();
    	/*	
    		try {
    			 t1.join();
    		}
    		catch(Exception e) {
    			System.out.println("e");
    		}
    		*/
    		
    		t2.start();
			
		}
    }


 