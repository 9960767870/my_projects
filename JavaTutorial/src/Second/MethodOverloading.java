package Second;

public class MethodOverloading {

	public void add(int age,String name) {
		System.out.println("1st");
		System.out.println(age+" "+name);
		
	}
	
	public void add(int rollno,double marks) {
		System.out.println("2nd");
		System.out.println(rollno+ " "+marks);
	}
	
	public void add(int a,int b,int c,int d) {
		System.out.println("3rd");
		System.out.println(a+b+c+d);
	}
	
	public void add(long phoneno,float d) {
		System.out.println("4th");
		System.out.println(phoneno+" "+d);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading m = new MethodOverloading();
		m.add(20, "rushi");
		m.add(100, 72.40);
		m.add(1, 2, 3, 4);

	}

}
