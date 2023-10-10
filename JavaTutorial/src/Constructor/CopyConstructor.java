package Constructor;

class Student{
	 
	int rollno;
	String name;
	int marks;
	
	
	public Student(int rollno, String name, int marks) {
	
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	
	
	public Student(Student s) {
		
		rollno = s.rollno;
		name = s.name;
		marks = s.marks;
		
		
	}
	public void display() {
		System.out.println(rollno+" "+name+" "+marks);
	}
		
}

public class CopyConstructor {

	public static void main(String[] args) {
		
		Student s = new Student(007, "Rushi", 100);
		s.display();
		
		Student s1 = new Student(s);//copy constructor
		s1.display();

	}

}
