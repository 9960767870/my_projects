package JavaTutorialForBegeningCodeWithHarry;

 import java.util.Calendar;

   public class Calender_Example { 
	  
   public static void main(String[] args) {
		
		  Calendar c = Calendar.getInstance();
		  
		  System.out.println(c.getCalendarType());
		  System.out.println(c.getTimeInMillis());
		  System.out.println(c.getTimeZone());
		  System.out.println(c.getTime());
	}



}
