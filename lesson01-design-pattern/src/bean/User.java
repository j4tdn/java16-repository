package bean;

public class User {
	private String firstname;
	private String lastname;
	private int age;
	private String phone;
	private String address;
	
	public static BuilderUser builder() {return new BuilderUser();}
	
	
	private User() {}

	private User(BuilderUser builderUser) {
		this.firstname = builderUser.firstname;
		this.lastname = builderUser.lastname;
		this.age = builderUser.age;
		this.phone = builderUser.phone;
		this.address = builderUser.address;
	}
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
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
		return "User [firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + ", phone=" + phone
				+ ", address=" + address + "]";
	}
	
	
	//nested class
	public static class BuilderUser{
		private String firstname;
		private String lastname;
		private int age;
		private String phone;
		private String address;
		
		private BuilderUser() {}
		
		
		public BuilderUser withFirstname(String firstname) {
			this.firstname = firstname;
			return this;
		}

		public BuilderUser withLastname(String lastname) {
			this.lastname = lastname;
			return this;
		}

		public BuilderUser withAge(int age) {
			this.age = age;
			return this;
		}

		public BuilderUser withPhone(String phone) {
			this.phone = phone;
			return this;
		}

		public BuilderUser withAddress(String address) {
			this.address = address;
			return this;
		}

		public User buildUser() {
			return new User(this);
		}
		
	}
	
	
}
