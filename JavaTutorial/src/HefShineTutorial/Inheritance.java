package HefShineTutorial;
class phone {
	void message() {
		System.out.println("message typing of p");
	}
	void calling() {
		System.out.println("calling of p");
	}
	
}

class nokia extends phone{
	void camera()
	{
		System.out.println("camera of n");
	}
	void games() {
		System.out.println("games of n");
	}
}

class vivo extends nokia {
	void beauty() {
		System.out.println("beauty of v");
	}
	void batterycapacity() {
		System.out.println("nice of v");
	}
}

public class Inheritance {

	public static void main(String[] args) {
      vivo v = new vivo();
      v.message();
      v.calling();
      v.camera();
      v.games();
      v.beauty();
      v.batterycapacity();
		
		

	}

}
