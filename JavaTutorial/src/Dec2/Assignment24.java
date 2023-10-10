package Dec2;

class Student{
	
	int rollno;
	String name;
	int marks;
	
	public Student(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
}

public class Assignment24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Student[] s = new Student[4];
       s[0] = new Student(1, "somu", 40);
       s[1] = new Student(2, "gomu", 41);
       s[2] = new Student(3, "somya", 42);
       s[3] = new Student(4, "gomya", 39);
       
       for (int i = 0; i < s.length; i++) {
		for (int j = i+1; j < s.length; j++) {
			if(s[i].marks>s[j].marks) {
				Student temp= s[i];
				s[i]=s[j];
				s[j]=temp;
			}
		}
	}
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		
	}

}
