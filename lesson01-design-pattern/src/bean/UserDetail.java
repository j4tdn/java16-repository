package bean;

public class UserDetail {
	private String firstName;
	private String lastName;
	private int age;
	private String phone;
	private String address;

	public UserDetail() {
	}

	public String getFirstName() {
		return firstName;
	}

	public UserDetail withFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public String getLastName() {
		return lastName;
	}

	public UserDetail withLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public int getAge() {
		return age;
	}

	public UserDetail withAge(int age) {
		this.age = age;
		return this;
	}

	public String getPhone() {
		return phone;
	}

	public UserDetail withPhone(String phone) {
		this.phone = phone;
		return this;
	}

	public String getAddress() {
		return address;
	}

	public UserDetail withAddress(String address) {
		this.address = address;
		return this;
	}

	@Override
	public String toString() {
		return "UserDetail [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", phone=" + phone
				+ ", address=" + address + "]";
	}

}
