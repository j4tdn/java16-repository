package bean;

public class User {
	// why we need to declare private
	// mandatory: firstName, lastName, the rest 
	private String firstName;
	private String lastName;
	private int age;
	private String phone;
	private String address;
	
	public User(Builder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.phone = builder.phone;
		this.address = builder.address;
	}
	
	public static Builder builder() {
		return new Builder();
	}
	// getter
	

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
	// nested class (class long nhau)
	public static class Builder{
		private String firstName;
		private String lastName;
		private int age;
		private String phone;
		private String address;
		
		private Builder() {
			
		}
		public Builder withFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}
		public Builder withLast(String lastName) {
			this.lastName = lastName;
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
		public Builder withAddress(String address) {
			this.address = address;
			return this;
		}
		public User build() {
			// this = current Builder (nguoi xay dung hien tai)
			return new User(this);
		}
	}
	
	

}
