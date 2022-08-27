package bean;

public class User {
	// why we need to declare private
	// mandatory: firstName, lastName, the rest is optional
	private String firstName;
	private String lastName;
	private int age;
	private String phone;
	private String address;

	public User(Builder bulder) {
		this.firstName = bulder.firstName;
		this.lastName = bulder.lastName;
		this.age = bulder.age;
		this.phone = bulder.phone;
		this.address = bulder.address;
	}

	public static Builder builder() {
		return new Builder();
	}

	// getter
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

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", phone=" + phone
				+ ", address=" + address + "]";
	}

	// nested class
	public static class Builder {
		private String firstName;
		private String lastName;
		private int age;
		private String phone;
		private String address;

		private Builder() {

		}

		// setter
		public Builder withFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public Builder withLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public Builder withtAge(int age) {
			this.age = age;
			return this;
		}

		public Builder withtPhone(String phone) {
			this.phone = phone;
			return this;
		}

		public Builder withtAddress(String address) {
			this.address = address;
			return this;
		}

		public User build() {
			// this = current Builder
			return new User(this);
		}
	}
}