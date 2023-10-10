package First;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year = 2016;
		
		if(year%100==0)
		{
			
		if(year%400==0)
		{
			System.out.println("is leap year");
		}
		else
		{
			System.out.println("is not leap year");
		}
		
		}
		
		else
		{
			if(year%4==0)
			{
				System.out.println("is leap year");
			}
			else
			{
				System.out.println("is not leap year");
			}
		}
		}
	}


