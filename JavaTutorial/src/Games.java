
public class Games {
	
	private int id;

	private String name;

	private String month;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	@Override
	public String toString() {
		return "Games [id=" + id + ", name=" + name + ", month=" + month + "]";
	}
	
	
}
