package First;

public class BasicSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int salary = 20000;
		
		if(salary<=10000) {
		  double total = salary+(salary*0.2)+(salary*0.8);
		  System.out.println("total salary is"+total);
		}
		if(salary<=20000) {
			double total = salary+(salary*0.25)+(salary*0.9);
			System.out.println("total salary is"+total);
			
		}
		if(salary>20000) {
			double total = salary+(salary*0.3)+(salary*0.95);
			System.out.println("total salary is"+total);
		}
		
	}

}
