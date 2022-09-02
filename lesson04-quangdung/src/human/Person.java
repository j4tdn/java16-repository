package human;

public abstract class Person {
	private String name;
	private String date;
	private float numOfSalary;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, String date, float numOfSalary) {
		this.name = name;
		this.date = date;
		this.numOfSalary = numOfSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public float getNumOfSalary() {
		return numOfSalary;
	}

	public void setNumOfSalary(float numOfSalary) {
		this.numOfSalary = numOfSalary;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", date=" + date + ", numOfSalary=" + numOfSalary + "]";
	}

	public abstract double calSalary();

}
