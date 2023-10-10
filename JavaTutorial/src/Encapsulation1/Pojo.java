package Encapsulation1;

public class Pojo {

	int noOfWheels;
	int NoOfGears;
	
	
	public Pojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	


	public Pojo(int noOfWheels, int noOfGears) {
		super();
		this.noOfWheels = noOfWheels;
		NoOfGears = noOfGears;
	}
	
	
	
	




	public int getNoOfWheels() {
		return noOfWheels;
	}




	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}




	public int getNoOfGears() {
		return NoOfGears;
	}




	public void setNoOfGears(int noOfGears) {
		NoOfGears = noOfGears;
	}




	@Override
	public String toString() {
		return "Pojo [noOfWheels=" + noOfWheels + ", NoOfGears=" + NoOfGears + "]";
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pojo p = new Pojo();
		p.setNoOfGears(4);
		System.out.println(p.getNoOfGears());
		p.setNoOfWheels(4);
		System.out.println(p.getNoOfWheels());
		
		System.out.println(p);
		
	}

}
