
public class Constructor 
{
	int add1;
	int add2;
	
	int age;
	String name;
	
	public Constructor(int add1,int add2) 
	{
		this.add1 = add1;
		this.add2 = add2;
		
		System.out.println(add1+add2);
	}
	
	public Constructor(int age,String name) 
	{

		this.age = age;
		this.name = name;
		
		System.out.println(age+" "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructor c = new Constructor(10, 20);
		Constructor c1 = new Constructor(100, "rushi");
	}

}
