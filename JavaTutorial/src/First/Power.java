package First;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 3;
		int power = 4;
		
		int mul = num1;
		
		while(power>1) {
			num1 = num1*mul;
			power--;
		}
		System.out.println(num1);

	}

}
