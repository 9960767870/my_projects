package Comparator;



public class Student  
{

	int age;
	int marks;
	String name;
	
	public Student(int age,int marks,String name) 
	{
		
		this.age = age;
		this.marks = marks;
		this.name = name;
	} 

	@Override
	public String toString() {
		return "Student [age=" + age + ", marks=" + marks + ", name=" + name + "]";
	}

	
}
