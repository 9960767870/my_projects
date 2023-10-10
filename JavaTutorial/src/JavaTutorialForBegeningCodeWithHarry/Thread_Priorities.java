package JavaTutorialForBegeningCodeWithHarry;

class Boss extends Thread{
	  
	Boss(String name){
		super(name);
	}
	
	 public void run() {
		 
		 
		 
		 int a = 34;
		 while(true) {
			 
			 System.out.println("The name of boss : " + this.getName());
			 
		//System.out.println("My Threads");
			 
			 a++;
		 }
	 }
	  
}

    public class Thread_Priorities {
   
    	public static void main(String[] args) { 
    		
			Boss t1 = new Boss("rushi");
			Boss t2 = new Boss("megha");
			Boss t3 = new Boss("shiva");
			Boss t4 = new Boss("jeet(most important)");
			Boss t5 = new Boss("bhai");
			
			t4.setPriority(Thread.MAX_PRIORITY);
			t1.setPriority(Thread.MIN_PRIORITY);
			t3.setPriority(Thread.MIN_PRIORITY);
			
		
		    t1.start(); 
		    t2.start(); 
		    t3.start(); 
		    t4.start(); 
		    t5.start(); 
		}
}
  