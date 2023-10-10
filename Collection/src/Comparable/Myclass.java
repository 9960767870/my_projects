package Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Myclass {

	public static void main(String[] args) 
	{
	
		ArrayList<Student> a = new ArrayList<Student>();
		
		a.add(new Student(50, "rushi", 42));
		
		a.add(new Student(40, "varad", 55));
		
		a.add(new Student(60, "sachin", 22));
		
		a.add(new Student(70, "raje", 7));
		
		Collections.sort(a);
		System.out.println(a);

	}

}
