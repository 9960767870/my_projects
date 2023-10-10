package HefShineTutorial;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      int num=370;
	        int temp = num;
	        int sum =0;
	        while(num > 0)
	        {
	            int rem= num % 10;
	            num = num /10;
	            sum += rem*rem*rem; 
	        }
	        if(temp == sum )
	            System.out.println("Armstrong number");
	        else
	            System.out.println("Not an Armstrong number");   
	    }
	

	}


