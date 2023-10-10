import java.util.List;

public class Navchari {

	private int id;
	
	private int number;
	
	private Games name;
	
	private List<Por> por;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Games getName() {
		return name;
	}

	public void setName(Games name) {
		this.name = name;
	}

	public List<Por> getPor() {
		return por;
	}

	public void setPor(List<Por> por) {
		this.por = por;
	}

	@Override
	public String toString() {
		return "Navchari [id=" + id + ", number=" + number + ", name=" + name + ", por=" + por + "]";
	}

	

}
