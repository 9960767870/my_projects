package Constructor;

public class Programing {
	
	String name;
	
	public Programing() {
		
		System.out.println("I Want To Learn To Languege");
	}
	
	public Programing(String name) {
		this.name = name;
	}
	
	public void display() {
		
		String Programing = "java";
		System.out.println("I Want Learn to "+Programing);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Programing p = new Programing();
		p.display();
		
		 
	}

}
