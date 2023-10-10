package Containtment;

class Authar{
	String authorName;
	int age;
	String place;
	public Authar(String authorName, int age, String place) {
		super();
		this.authorName = authorName;
		this.age = age;
		this.place = place;
	}
	
	
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	
	
}

class Book{
	String name;
	int price;
	Authar authar;
	public Book(String name, int price, Authar authar ) {
		super();
		this.name = name;
		this.price = price;
		this.authar = authar ;
	}
	
	public void  showDetails() {
		System.out.println(name+" "+price+" "+authar);
	}

}
public class Assingment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Authar a = new Authar("Rushi", 10, "akluj");
		a.setAge(1000);
		a.setAuthorName("bhosale");
		a.setPlace("pune");
		System.out.println(a.getAge());
		System.out.println(a.getAuthorName());
		System.out.println(a.getPlace());
		
		Book b =new Book("sachin", 30000, a);
		b.showDetails();
	}

}
