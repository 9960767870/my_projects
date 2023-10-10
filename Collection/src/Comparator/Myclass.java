package Comparator;

import java.util.ArrayList;
import java.util.Collections;import java.util.Comparator;
import java.util.List;

public class Myclass {

	public static void main(String[] args) {
		
		ArrayList<Student> a = new ArrayList<Student>();
		
		a.add(new Student(20, 77, "rushi"));
		
		a.add(new Student(10, 90, "sada"));
		
		a.add(new Student(30, 80, "daga"));
		
		a.add(new Student(50, 99, "shubhash"));
		
		Collections.sort(a, new Abcd());
		
		System.out.println(a);

	}

}
