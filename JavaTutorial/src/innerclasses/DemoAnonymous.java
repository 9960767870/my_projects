package innerclasses;
 
abstract class DemoAno{
	
	abstract void show();
}
public class DemoAnonymous {
	
	public static void main(String[] args) {
	DemoAno d =new DemoAno() {
		
		@Override
		void show() {
			// TODO Auto-generated method stub
			System.out.println("Hello");
			
		}
	};
	d.show();
	
	}
}
