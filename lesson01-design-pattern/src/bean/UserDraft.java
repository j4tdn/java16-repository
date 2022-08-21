package bean;

public class UserDraft {
	private String firstname;
	private String lastname;
	private int age;
	private String phone;
	private String address;
	
	public UserDraft() {}

	public UserDraft(BuilderUser builderUser) {
		this.firstname = builderUser.firstname;
		this.lastname = builderUser.lastname;
		this.age = builderUser.age;
		this.phone = builderUser.phone;
		this.address = builderUser.address;
	}
	

	@Override
	public String toString() {
		return "User [firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + ", phone=" + phone
				+ ", address=" + address + "]";
	}
	
	public static class BuilderUser{
		private String firstname;
		private String lastname;
		private int age;
		private String phone;
		private String address;
		
		public BuilderUser setFirstname(String firstname) {
			this.firstname = firstname;
			return this;
		}

		public BuilderUser setLastname(String lastname) {
			this.lastname = lastname;
			return this;
		}

		public BuilderUser setAge(int age) {
			this.age = age;
			return this;
		}

		public BuilderUser setPhone(String phone) {
			this.phone = phone;
			return this;
		}

		public BuilderUser setAddress(String address) {
			this.address = address;
			return this;
		}

		public UserDraft buildUser() {
			return new UserDraft(this);
		}
		
	}
	
	
}
