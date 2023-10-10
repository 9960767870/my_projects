package Constructor;

class Vehival{
	String color = "Black";
	int wheelCount = 4;
	int gearCount = 5;
	
	public Vehival() {
		System.out.println(color+" "+wheelCount+" "+gearCount);
	}
	
	public Vehival(String color,int gearCount) {
		this();
		this.color = color;
		this.gearCount = gearCount;
		System.out.println(color+" "+gearCount);
		
	}
	
}

public class MyClass3 {

	public static void main(String[] args) {
		
		//Vehival v = new Vehival();
		
		Vehival v = new Vehival("red", 8);

	}

}
