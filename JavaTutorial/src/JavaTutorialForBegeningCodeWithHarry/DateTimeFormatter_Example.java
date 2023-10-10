  package JavaTutorialForBegeningCodeWithHarry;

   import java.time.LocalDateTime;
   import java.time.format.DateTimeFormatter;

     public class DateTimeFormatter_Example {
	  
    public static void main(String[] args) {
		
	 LocalDateTime dt = LocalDateTime.now();     //This is date
	 System.out.println(dt);
		 
	 DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy --E H:m a");   //This is Format
	
	//DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;
	
	String myDate = dt.format(df);  //creating date String using date and format
	System.out.println(myDate);
	}

}
