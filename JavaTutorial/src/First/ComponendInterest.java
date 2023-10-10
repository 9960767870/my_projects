package First;

public class ComponendInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m = 10000;
		int r = 10;
		int n = 12;
		int y = 5;
		
		double a = 1+(r/(n*100.0));
		int b = n*y;
		double amount = m*Math.pow(a, b);
		System.out.println(amount);

	}

}
