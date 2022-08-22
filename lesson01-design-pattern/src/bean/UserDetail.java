package bean;
/**
 * Builder pattern
 * @author hien
 *
 */
public class UserDetail {
	private String firstName;
	private String lastName;
	private int age;
	private String phone;
	private String address;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}

	public UserDetail withFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public UserDetail withLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public UserDetail withAge(int age) {
		this.age = age;
		return this;
	}

	public UserDetail withPhone(String phone) {
		this.phone = phone;
		return this;
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
