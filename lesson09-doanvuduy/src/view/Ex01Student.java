package view;

public class Ex01Student {
	private int studentId;
	private String name;
	private String type;

	public Ex01Student() {

	}

	public Ex01Student(int studentId, String name, String type) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.type = type;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", type=" + type + "]";
	}

}
