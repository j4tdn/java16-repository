package bean;

public class User {
	private String firstName;
	private String lastName;
	private int age;
	private String phone;
	private String address;

	public User(Builder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = age;
		this.phone = phone;
		this.address = address;
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

	// nasted class
	public static class Builder {
		private String firstName;
		private String lastName;
		private int age;
		private String phone;
		private String address;

		// setter
		public Builder withFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public Builder withLastName(String lastName) {
			this.firstName = lastName;
			return this;
		}

		public Builder withAge(int age) {
			this.age = age;
			return this;
		}

		public Builder withPhone(String phone) {
			this.phone = phone;
			return this;
		}

		public Builder withAdress(String Adress) {
			this.address = address;
			return this;
		}

		public User build() {
			// this = current Builder xem lai
			return new User(this);
		}
	}

}
