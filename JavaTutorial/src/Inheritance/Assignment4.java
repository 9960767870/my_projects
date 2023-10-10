package Inheritance;

class S{
	int maxspeed = 100;
	
}
class V extends S{
	int maxspeed = 180;
	
	final int a = 1000;
	public  void dispaly() {
		System.out.println("Maxspeed is: "+super.maxspeed);
		System.out.println(a);
	}
}

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    V b = new V();
    b.dispaly();
   
    
		
	}

}
