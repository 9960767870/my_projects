package Comparable;

public class Student implements Comparable<Student>
{

	int age;
	String name;
	int marks;
	
	public Student(int age,String name,int marks) 
	{
	
		this.age = age;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student s1) 
	{
		
		//age sorting
//		if(age<s1.age)
//		{
//			return -1;
//		}
//		else if(age>s1.age)
//		{
//			return 1;
//		}
//		return 0;
		
		//marks sorting
		
//		if(marks<s1.marks)
//		{
//			return -1;
//			
//		}
//		
//		else if(marks>s1.marks)
//		{
//			return 1;
//		}
//		else
//		{
//			return 0;
//		}
		
		// name sorting
		
		return s1.name.compareTo(name);
	}
}
