package ArrayPakage;

 public class ArrayExample3 {
	public static void main(String[] args) {
		
		int[] avarageArrayExample= {10,20,30,40,50,60,70,80,90};
		
		int avarageresult = 0;
		
		for(int a=0;a<avarageArrayExample.length;a++) {
			
			avarageresult=avarageresult+avarageArrayExample[a];
		}
		
		System.out.println("The avarage result is : " +avarageresult/avarageArrayExample.length);
			
			
			
		}
		
	}


