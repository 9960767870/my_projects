package OopsConcept;

public class Interface {

	public static void main(String[] args) {
	
		Child c = new Child();
		
		c.show();
		c.showname();
	

	}

}

 interface Parent
{
	 void show();
	 
}
 
 interface parent2
 {
	 void showname();
	 
 }
 
 class Child implements Parent,parent2
 {
        int age =40;
        String name = "rushi";

	 public void show() {
		
		System.out.println("This is child method");
		System.out.println(age);
	}

	@Override
	public void showname() {
		// TODO Auto-generated method stub
		
		System.out.println("my name is rushikesh");
		System.out.println(name);
	}
	 
 }
