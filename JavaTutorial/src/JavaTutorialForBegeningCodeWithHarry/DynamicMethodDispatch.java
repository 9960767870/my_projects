package JavaTutorialForBegeningCodeWithHarry;

class Phone{
	
	public void showtime() {
		
		System.out.println("Time is 8 pm ... ");
	}

	public void on() {
		System.out.println("Tearning on Phone");
	}
}

	class SmartPhone extends Phone {
		
		public void music() {
			
			System.out.println("play on music");
		}
		
		public void on() {
		
		System.out.println("Tearning on SmartPhone");
	}
	
	}
	
   public class DynamicMethodDispatch {                  
	   public static void main(String[] args) {
		   
		   Phone sc = new SmartPhone();
		   sc.showtime();
		   sc.on();
		
	}
   }


