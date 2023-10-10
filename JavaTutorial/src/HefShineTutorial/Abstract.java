package HefShineTutorial;
abstract class Animal{
	abstract void cat();
}

class dog extends Animal{
	void  cat() {
		System.out.println("I am cat");
	}
	
}

public class Abstract {
	public static void main(String[] arg) {
		
		dog d = new dog();
		d.cat();
	}

}
