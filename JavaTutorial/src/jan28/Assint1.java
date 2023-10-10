package jan28;

public class Assint1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 33; i <=999; i++) 
		{
			if(i%3==0 && i%5==0)
				System.out.println("Pink and Yellow");
			else if(i%3==0)
				System.out.println("Pink");
			else if(i%5==0)
				System.out.println("Yellow");
			else
				System.out.println(i);
			
		}
	}

}
