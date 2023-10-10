package AbstractClass;

abstract class DevOne{
	
	public void add() {
		int a = 10;
		int b = 20;
		System.out.println("add is: "+(a+b));
	}
	
	public void sub() {
		int a = 30;
		int b = 40;
		System.out.println("sub is: "+(a-b));
	}
	
	public abstract void mul();
	public abstract void div();
}

 abstract class DevTwo extends DevOne{

	
	public abstract void modul();

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		System.out.println(a*b);
		
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		System.out.println(a/b);
	}
	
	
}

class DevThree extends DevTwo{
	
	public void modul() {
		System.out.println("modul");
	}
}
public class Myclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DevThree d = new DevThree();
		d.add();
		d.sub();
		d.mul();
		d.div();
		d.modul();
	}

}
