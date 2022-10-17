package ex01Student;

public class Student {
	private int id;
	private String name;
	public Enum en;
	
	public Student() {
		
	}

	public Student(int id, String name, Enum en) {
		super();
		this.id = id;
		this.name = name;
		this.en = en;
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

	public Enum getEn() {
		return en;
	}

	public void setEn(Enum en) {
		this.en = en;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", en=" + en + "]";
	}

	
	

	
	
	
}

