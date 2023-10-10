 package Practice_Set;
 
 import java.util.*;

 public class Shuffle_Example {
	 
	 public static void main(String[] args) {
		
		 ArrayList<String> st = new ArrayList<String>();
		 
		 st.add("rushi");
		 st.add("megha");
		 st.add("jeet");
		 st.add("shiv");
		 st.add("kamal");
		 
		 System.out.println("Oringnal list : \n " + st);
		 
		 Collections.shuffle(st);
		 
		 System.out.println("Shuffled list : \n" + st);
		 
		 
	}

	
}
