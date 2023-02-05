package problem05.bean;

public class Student {
	private String id;
	private String name;
	private Double gpa;
	private String gender;

	public Student() {
	}

	public Student(String id, String name, Double gpa, String gender) {
		this.id = id;
		this.name = name;
		this.gpa = gpa;
		this.gender = gender;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getGpa() {
		return gpa;
	}

	public void setGpa(Double gpa) {
		this.gpa = gpa;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public static Student transfer(String line) {
		String[] elements = line.split(", ");
		if (elements.length != 4) {
			System.out.println(line + "...has...wrong format!");
			return null;
		}
		return new Student(elements[0], elements[1], Double.parseDouble(elements[2]), elements[3]);
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gpa=" + gpa + ", gender=" + gender + "]";
	}

}
