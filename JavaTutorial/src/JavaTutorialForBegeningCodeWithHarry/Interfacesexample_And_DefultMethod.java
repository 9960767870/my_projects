package JavaTutorialForBegeningCodeWithHarry;


interface MyCamera{
	 
	 void takeSnap();
	 void recordVidieo();
	 default void recork4kVidieo() {
		 System.out.println("Recordint in 4k");
	 }
 }
 
 interface MyWifi{
	 
	 String[] getNetworks();
	 void connectToNetwork(String network);
 }
 
  class Mycellphone{
	  
	  void callNumber(int phoneNumber) {
		  System.out.println("Calling "+ phoneNumber);
	  }
	  
	  void pickCall() {
		  System.out.println("Connecring ");
	  }
  }
	  
	  class MySamsungphone extends Mycellphone implements MyCamera,MyWifi{
		  
		 public void takeSnap() {
			  System.out.println("Taking snap");
		  }
		 
		 public void recordVidieo() {
			 System.out.println("Taking record vidieo");
		 }
		 
		 public void record4kVidieo() {
			 System.out.println("Recordint 4k vidieo");
		 }
		 
		 public String[] getNetworks() {
			 System.out.println("Geting list of network");
			 String[] networklist = {"Rushi","Shiv","Megha","Jeet"};
			 return networklist;
		 }
		 
		 public void connectToNetwork(String network) {
			 System.out.println("Connecting to "+network);
			 
		 }
		 
	  }
	
   public class Interfacesexample_And_DefultMethod {
   
	     public static void main(String[] args) {
		MySamsungphone ms = new MySamsungphone();
			
			ms.callNumber(99);
			ms.connectToNetwork("full");
			ms.takeSnap();
			ms.record4kVidieo();
			
			
			
			String[] ar = ms.getNetworks();
			
			for(String item:ar) {
				
				System.out.println(item);
			}
			
		}
}
