package bean;

public class Student {
	private String id;
	private String name;
	private double avg;
	private String gender;
	
	public Student() {
	}

	public Student(String id, String name, double avg, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.avg = avg;
		this.gender = gender;
	}
	
	public static Student transfer(String line) {
		String[] elements = line.trim().split(",\\s+");
		if (elements.length != 4) {
			return null;
		}
		return new Student( elements[0], elements[1], Double.parseDouble(elements[2]), elements[3]);
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

	public double getAvg() {
		return avg;
	}

	public void setAvg(float avg) {
		this.avg = avg;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", avg=" + avg + ", gender=" + gender + "]";
	}
}
