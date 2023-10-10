package Ooops;

public class CopyConstructor 
{
	int rollno  =1;
	String name = "rushi";
	int marks = 20;
	
	public CopyConstructor(int rollno,String name,int marks) 
	{
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
		
	}
	
	 
	 
	CopyConstructor(CopyConstructor c)
	{
		rollno = c.rollno;
		name = c.name;
		marks = c.marks;
		
	}
	
	void display()
	{
		System.out.println(rollno+" "+name+" "+marks);
	}

	public static void main(String[] args) {
		
		
		CopyConstructor c = new CopyConstructor(20, "bhosale", 60);
		c.display();
		
		//CopyConstructor c1 = new CopyConstructor(c.rollno, c.name, c.marks);
		
		CopyConstructor c2 = new CopyConstructor(c);
		c2.display();
		

	}

}
