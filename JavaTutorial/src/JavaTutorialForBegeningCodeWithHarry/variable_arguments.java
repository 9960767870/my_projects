package JavaTutorialForBegeningCodeWithHarry;

public class variable_arguments {
	
	static int sum(int ...arr) {
		
		int result = 0;
		 
		 for(int a:arr) {
			 result += a;
		 
		 }
		 
		 return result;
		 
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("well come to varar g tutorial ");
		System.out.println("The sum of 3 and 5 is : " + sum(3,5));
		System.out.println("The sum of 10 and 5 is : " + sum(10,5));
		System.out.println("The sum of 110 and 188 is : " + sum(110,188));
		System.out.println("The sum of 100 and 200 is : " + sum(100,200));
	}
		
		 }
	
