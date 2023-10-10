package Containtment;

class Emplyee{
	
	int id;
	String name;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getString() {
		return name;
		
	}
	
}

public class Assingnment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Emplyee e = new Emplyee();
		e.setId(007);
		e.setName("Rushi");
		System.out.println(e.getId());
		System.out.println(e.getString());
	}

}
