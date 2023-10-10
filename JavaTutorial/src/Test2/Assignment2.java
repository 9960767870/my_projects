package Test2;

class Workar{
	
	public void transportAllowance(int salary) {
		
		double total= (0.1*salary);
		System.out.println(total);
		
	}
}

class Boss extends Workar{
	
	public void transportAllowance(int salary) {
		
		double total = (0.15*salary);
		System.out.println(total);
	}
}

class Trainer extends Workar{
	public void transportAllowance(int salary) {
		
		double total= (0.1*salary);
		System.out.println(total);
		
	}
	
}

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Workar w = new Workar();
		w.transportAllowance(40000);
		  
		Boss b = new Boss();
		b.transportAllowance(50000);
		
		Trainer t = new Trainer();
		t.transportAllowance(30000);
		
		
	}

}
