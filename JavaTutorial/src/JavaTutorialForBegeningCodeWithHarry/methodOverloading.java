package JavaTutorialForBegeningCodeWithHarry;

public class methodOverloading {
	String name;
	
	public void flats() {
		System.out.println("Data is not ensred");
		
	}
	
	public void flats(int a) {
		System.out.println("The value of : " + a);
		
	}
      
	public void flats(int a,int b) {
		System.out.println("The value of : " + a + b );
		
		
	}
	

	
	public static void main(String[] args) {
		
		methodOverloading mc = new methodOverloading();
		mc.flats(100,200);
		
	}
		
	}

