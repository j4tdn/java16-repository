package bin;

public class User {
	//bắt buộc: firstName; lastName
	//không bắt buộc: còn lại
	private String firstName;
	private String lastName;
	private int age;
	private String phone;
	private String  address;
	
	public User(Builder builder) {
		this.firstName=builder.firstName;
		this.lastName=builder.lastName;
		this.age=builder.age;
		this.phone=builder.phone;
		this.address=builder.address;
		//getter
		private User(Builder builder) 
			this.firstName=builder.firstName;
			this.lastName=builder.lastName;
			this.age=builder.age;
			this.phone=builder.phone;
			this.address=builder.address;
			
		}
		public static Builder builder() {
			return new Builder();
		}
	
	
	
	
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", phone=" + phone
				+ ", address=" + address + "]";
	}

	//nested class:lồng nhau
	public static class Builder{
		private String firstName;
		private String lastName;
		private int age;
		private String phone;
		private String  address;
		
		private Builder(){
			
		}
		
		//setter
		public Builder withFirstName(String firstName) {
			this.firstName=firstName;
			return this;
		}
		public Builder withLastName(String lastName) {
			this.lastName=lastName;
			return this;
		}
		public Builder withAge(int age) {
			this.age=age;
			return this;
		}
		public Builder withphone(String phone) {
			this.phone=phone;
			return this;
		}
		public Builder withaddress(String address) {
			this.address=address;
			return this;
		}
		public User build() {
			return new User(this);
		}
		
	}

	
	
	
}
