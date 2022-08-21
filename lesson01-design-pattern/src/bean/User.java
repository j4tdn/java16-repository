package bean;

public class User {
	//why we need to declare private
	private String firstName;
	private String lastName;
	private int age;
	private String phone;
	private String address;
	
	private User(Builder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.phone = builder.phone;
		this.address = builder.address;
	}
	
	public static Builder builder() {
		return new Builder();
	}
	
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", phone=" + phone
				+ ", address=" + address + "]";
	}
	
	
	public static class Builder{
		private String firstName;
		private String lastName;
		private int age;
		private String phone;
		private String address;
		
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
		public Builder withAdress(String Adress) {
			this.address = address;
			return this;
		}
		
		
		public User build() {
			//this = curren builder
			return new User(this);
		}
		
	}
	
	
	
	

}
