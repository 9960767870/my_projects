package JavaTutorialForBegeningCodeWithHarry;

public class GettersSetters {
	
	private int id;
	private String name;

	public int getId() {
		return  id;
		
	}
	
	public void setId(int i) {
		id = i;
	}
	
	public String getname() {
		return name;
	}
	
	public void setname(String n) {
		name = n;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GettersSetters gs = new GettersSetters();
		
		gs.setId(45);
		System.out.println(gs.getId());
		
		gs.setname("Rushi");
		System.out.println(gs.getname());
		

	}

}
 