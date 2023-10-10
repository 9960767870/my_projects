package Second;

public class Student {
	
	int rollno1;
	String name1;
	int contact1;
	double marks1;
	
	public void input(int rollno,String name,int contact,double marks) {
		
		rollno1 = rollno;
		name1 = name;
		contact1 = contact;
		marks1 = marks;
		
	}
	
	public void display() {
		System.out.println(rollno1+" "+name1+" "+contact1+" "+marks1);
		
		
	}

	

}
