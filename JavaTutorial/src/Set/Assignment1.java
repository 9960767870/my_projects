package Set;



public class Assignment1 {
	
	public static int add(int a1,int b1) {
		System.out.println("welcome");
		System.out.println(a1+b1);
		return 0;
	}
	
	public static int sub(int a1,int b1) {
		System.out.println("welcome");
		System.out.println(a1-b1);
		return 0;
	}
	
	public static int mul(int a1,int b1) {
		System.out.println("welcome");
		System.out.println(a1*b1);
		return 0;
	}
	
	public static void main(String[] args) {
		int a = 30;
		
		 switch(a) {
		  
		  case 10:
			  System.out.println(add(10, 20));
			  break;
			
		  case 20:
			  System.out.println(sub(40, 20));
			  break;
			  
		  case 30:
			  System.out.println(mul(40, 20));
			  break; 
			 
		default :
			System.out.println("Not addition and substraction");
			  
			  
		  	  
		 }  
		
	
	}
}
	

		 
		
		
		
	

	

