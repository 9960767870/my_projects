 package Practice_Set;

 public class IslandIsolation_Example {
		 
		 IslandIsolation_Example i;
	 
	 
	 public static void main(String[] args) {
		
		 IslandIsolation_Example t1 = new IslandIsolation_Example();
		 IslandIsolation_Example t2= new IslandIsolation_Example();
		   
		 t1.i = t2;
		 t2.i = t1;
		 
		 t1 = null;
		 t2 = null;
		 
		 System.gc();
	 }
		 
		 protected void finalize() throws Throwable{
			 
			 System.out.println("Finalize method called");
		 }
		 
	}