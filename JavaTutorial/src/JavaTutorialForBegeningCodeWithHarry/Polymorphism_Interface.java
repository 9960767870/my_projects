package JavaTutorialForBegeningCodeWithHarry;


interface MyCamera2{
	 
	 void takeSnap();
	 void recordVidieo();
	 default void recork4kVidieo() {
		 System.out.println("Recordint in 4k");
	 }
 }
 
 interface MyWifi2{
	 
	 String[] getNetworks();
	 void connectToNetwork(String network);
 }
 
  class Mycellphone2{
	  
	  void callNumber(int phoneNumber) {
		  System.out.println("Calling "+ phoneNumber);
	  }
	  
	  void pickCall() {
		  System.out.println("Connecring ");
	  }
  }
	  
	  class MySamsungphone2 extends Mycellphone2 implements MyCamera2,MyWifi2{
		  
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

   class Polymophism_Interface{
	   public static void main(String[] args) {
		   
		//MyCamera2 cam1 = new MySamsungphone2();  //This is smart phone but it use a camera
		
		//cam1.recordVidieo();
		//cam1.takeSnap();
		   
//		   MyWifi2 my = new MySamsungphone2();
//		   
//		   my.connectToNetwork("full");
		   
//		   MySamsungphone2 m1 = new MySamsungphone2();
//		   
//		   m1.takeSnap();
//		   m1.record4kVidieo();
//		   m1.recordVidieo();
//		   m1.getNetworks();
				   
		MyCamera2 m = new MySamsungphone2();
		m.takeSnap();
		
		
		
	}
   }
