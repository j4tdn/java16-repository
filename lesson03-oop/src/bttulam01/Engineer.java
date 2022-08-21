package bttulam01;

public class Engineer {
	private String name;
	private int age;
	private String gender;
	private String address;
	private String major;
	public Engineer() {
		
	}
	public Engineer(String name, int age, String gender, String address, String major) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.major = major;
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
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	@Override
	public String toString() {
		return "Engineer [name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address + ", major="
				+ major + "]";
	}
	

}
