package Ex01;

public class Student {
	private int id;
	private String name;
	private Enum classification;
	
	public Student() {
		
	}

	public Student(int id, String name, Enum classification) {
		this.id = id;
		this.name = name;
		this.classification = classification;
	}

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

	public Enum getClassification() {
		return classification;
	}

	public void setClassification(Enum classification) {
		this.classification = classification;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", classification=" + classification + "]";
	}
}
