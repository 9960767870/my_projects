package JavaTutorialForBegeningCodeWithHarry;

   public class try_catch {
	   
	   public static void main(String[] args) {
		
		   int a = 100;
		   int b =  0;
		   
		   try {
			 int  c = a/b;
			   System.out.println("c");
		   }		   
		   catch(Exception e) {
			   
			   System.out.println("We failed to divided . Reason :");
			   
			   System.out.println(e);
			   
			 //  System.out.println("End of the program");
			
		   }
	}

}
