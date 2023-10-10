package Containtment;

class Address{
	
	int streetNo ;
	String country ;
	String city;	
	String state ;
	
	
	public Address(int streetNo, String country, String city, String state) {
		
		this.streetNo = streetNo;
		this.country = country;
		this.city = city;
		this.state = state;
		
		
	}
	
	
}

class Person {
	
	String PName ;
	long PAdhaarNo ;
	String PJobName ;
	int PJobId;
	String PJobLocation;
	Address a;
	
	public Person(String pName,long pAdhaarNo, String pJobName, int pJobId, String pJobLocation,Address a) {
		
		PName = pName;
		PAdhaarNo = pAdhaarNo;
		PJobName = pJobName;
		PJobId = pJobId;
		PJobLocation = pJobLocation;
		this.a = a;
		
	}
	
	//Address a = new Address(007, "Rushi", "id", "pune");
	
	
	public void  displayPersonDetails() {
		System.out.println(PName+" "+PAdhaarNo+" "+PJobName+" "+PJobId+" "+PJobLocation+" "+a.city);
		
	}
	
	
}

class Collage{
	 String collegeName;
	 String AddresscollegeAddress;
	 
	public Collage(String collegeName, String addresscollegeAddress) {
		
		this.collegeName = collegeName;
		this.AddresscollegeAddress = addresscollegeAddress;
	}
	
	public void displayCollegeDetails() {
		
		Collage c = new Collage("GFCCT", "Akluj");
	}
	 
	 

}

class Staff{
	 String employeeName;

	 String  employeeAddress;
	 
	 public Staff(String employeeName,String employeeAddress) {
		
		 this.employeeAddress = employeeAddress;
		 this.employeeName = employeeName;
	}
	 public void  displayStaffDetails() {
		 
		 System.out.println(employeeName+" "+employeeAddress);
	 }
}

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Person p = new Person("varad", 336269494, "it", 007, "akluj",new Address(99, "india", "akluj", "maharashtra"));
		p.displayPersonDetails();
		System.out.println(p.a.city);
		
		
		Staff s = new Staff("sachin", "akluj");
		s.displayStaffDetails();
		
		
		
		
		
	   
	
	    
		
		
		
	}

}
