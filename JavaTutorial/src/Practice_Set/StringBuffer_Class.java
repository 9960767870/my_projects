package Practice_Set;

public class StringBuffer_Class {

	public static void main(String[] args) {
		
		StringBuffer gc = new StringBuffer("Geeksforgeeks");
		 
		//length and capacity
		int p = gc.length();
		int q = gc.capacity();
		
		System.out.println("Length of string geeksforgeeks " + p);
		System.out.println("Capacity of string geeksforgeeks " + q);
		
		System.out.println(gc.reverse());
		
		
//		//stringbuffer append
//		 
//		StringBuffer s = new StringBuffer("Geeksfor");
//		s.append("Geeks");
//		System.out.println(s);
//		
//		s.append(1);
//		System.out.println(s);
//		
//	
//             
//		
//		//insert;
//		
		StringBuffer s4 = new StringBuffer("GeeksGeeks");
		s4.insert(5,"for");
		System.out.println(s4);
//		
		s4.insert(0, 1);
		System.out.println(s4);
//		
//		s4.insert(5, true);
//		System.out.println(s4);
//		
//		char Geeks_arr[] = {'a','b','c','d'};
//		s4.insert(2, Geeks_arr);
//		System.out.println(s4);
//		      
//		     
//		
//		//reverse
//		
//		StringBuffer s6 = new StringBuffer("Rushikesh");
//		s6.reverse();
//		System.out.println(s);
//		
//		
//		
//		//delete and deletecharAt
//		
//		StringBuffer s7 = new StringBuffer("Rushikesh");
//		s7.delete(0, 5);
//		System.out.println(s7);
//		
//		s7.deleteCharAt(3);
//		System.out.println(s7);
//		
//		     
//		
//		//replace
//		
//		StringBuffer s8 = new StringBuffer("Rushikesh");
//		s8.replace(5, 9, "Don2");
//		System.out.println(s8);
//		
//		System.out.println(s.reverse());
//		
		     
		
		
	}

}
