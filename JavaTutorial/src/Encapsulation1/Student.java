package Encapsulation1;

public class Student {
	
	private int noOfWheels;
	
	public void setNoOfWheels(int num) {
		if(num>=0 && num<=5)
		noOfWheels = num;
	}
	public int getNoOfWheels() {
		return noOfWheels;
		
	}

}
