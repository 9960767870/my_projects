package Comparator;

import java.util.Comparator;

public class Abcd implements Comparator<Student>
{
	@Override
	public int compare(Student s1, Student s2) 
	{
		
		//age sorting
		 
//		if(s1.age<s2.age)
//		{
//			return -1;
//		}
//		
//		else if(s1.age>s2.age)
//		{
//			return 1;
//		}
//		else
//		{
//			return 0;
//		}
		
		
		// marks sorting
		
//		if(s1.marks<s2.marks)
//		{
//			return -1;
//		}
//		else if(s1.marks>s2.marks)
//		{
//			return 1;
//		}
//		else
//		{
//			return 0;
//		}
		
		//name sorting
		
		return s1.name.compareTo(s2.name);
		
	}
}
