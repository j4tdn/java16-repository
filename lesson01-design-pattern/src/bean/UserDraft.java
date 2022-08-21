package bean;

public class UserDraft {
	private String firstName;
	private String lastName;
	private int age;
	private String phone;
	private String address;
	
	public UserDraft() {
	}

	public UserDraft(String firstName, String lastName, int age, String phone, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", phone=" + phone
				+ ", address=" + address + "]";
	}
	
	
	
	

}
