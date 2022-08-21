package bean;

public class User {
	private String firstName;
	private String lastName;
	private int age;
	private String phone;
	private String address;
	
	
		//getter
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
		
		
		
		
		public String toString() {
			return "User [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", phone=" + phone
					+ ", address=" + address + "]";
		}
		
		private Builder() {
			
		}
		//setter
		public Builder withFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}
		public Builder withLastName(String lastName) {
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
			//this = current Builder
			return new User(this);
		}
	
	
		
	
	

}
