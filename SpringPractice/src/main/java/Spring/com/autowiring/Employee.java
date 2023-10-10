package Spring.com.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee 
{
	private Address address;
	
	

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) 
	{
		System.out.println("set the value");
		this.address = address;
	}
	
	public Employee(Address address) 
	{
		super();
		System.out.println("i am constructor");
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
	
	

}
