package Spring.com.lifecycle;

public class Bike
{
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	public Bike() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Bike [price=" + price + "]";
	}
	
	public void init()
	{
		System.out.println("inside the init method");
	}
	
	public void destroy()
	{
		System.out.println("inside the destroy method");
	}
	
	

}
