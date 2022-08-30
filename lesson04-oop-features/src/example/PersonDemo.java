package example;

public class PersonDemo {

	public static void main(String[] args) {
		Student std = new Student() {
			
			@Override
			public void gender() {
				System.out.println("Male");
			}
		};
		
		std.eat();
		
		Employee emp = new Employee() {
			
			@Override
			public void gender() {
				System.out.println("Male");
				
			}
		};
		emp.eat();
	}

}
