import java.util.List;

public class Por {

	private int id;
	
	private List<String> name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<String> getName() {
		return name;
	}

	public void setName(List<String> name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Por [id=" + id + ", name=" + name + "]";
	}
	
	
}
