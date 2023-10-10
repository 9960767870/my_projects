package JavaTutorialForBegeningCodeWithHarry;

class Ekclass{
	
	int a;
	
	public Ekclass(int v) {
		
		this.a = v;
		
	}
}

public class ThisKeyword {
	public static void main(String[] args) {
		
		Ekclass e = new Ekclass(10);
		System.out.println(e.a); 
	}

}
