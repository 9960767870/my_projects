package JavaTutorialForBegeningCodeWithHarry;

import java.time.Clock;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Date_Class { 
	  
	  public static void main(String[] args) {
		  
		  Date d = new Date();
		  System.out.println(d);
		  System.out.println(d.getTime());
		  LocalDate ld = LocalDate.now();
		  DateTimeFormatter obj = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		  obj.format(ld);
		  System.out.println(ld);
		  Clock ck = Clock.systemUTC();
		  System.out.println(ck.instant());
		  
	  }

}
