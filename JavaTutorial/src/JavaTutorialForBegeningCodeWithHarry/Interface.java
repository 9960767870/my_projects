 package JavaTutorialForBegeningCodeWithHarry;

 interface Bicycle{
	 
	 void applyBreak(int decrement);
	 void speedUp(int increment);
	 
 }
 
 interface Hornpleace{
	 
	 void blowHorns();  
	 void blowMhn();
 }
 
  class Rushicycle implements Bicycle,Hornpleace{
	  
	  void blowHorn() {
		  System.out.println("Pee pee pooo pooo");
	  }
	  
	public void applyBreak(int decrement) {
		  System.out.println("Applying break ");
	  }
	  
	 public void speedUp(int increment) {
		  System.out.println("Applying speesup");
	  }
	 
	 public void blowHorns() {
		 System.out.println("peee peee peee peee");
		 
		 
	 }
	 
	 public void blowMhn() {
		 System.out.println("pooo pooo pooo poooo");
	 }
  }

   public class Interface {
	   public static void main(String[] args) {
		   
		   Rushicycle Cycle = new Rushicycle();
		   
		   Cycle.blowHorn();
		   Cycle.speedUp(1);
		   
		   Cycle.blowHorns();
		   Cycle.blowMhn();
		
	}

}
