package bean;

public class Student extends PerSon {
	private String id;
	
	public Student() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Student(String id) {
		super();
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + "]";
	}
	
}
