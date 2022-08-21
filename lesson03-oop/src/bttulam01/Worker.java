package bttulam01;

public class Worker {
	private String name;
	private int age;
	private String gender;
	private String address;
	private int level;
	public Worker() {
		
	}
	public Worker(String name, int age, String gender, String address, int level) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.level = level;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	@Override
	public String toString() {
		return "Worker [name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address + ", level="
				+ level + "]";
	}
	

}
