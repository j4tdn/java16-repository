package example;

public class PersonDemo {
	public static void main(String[] args) {
		Student da = new Student() {
			
		
			@Override
			public void gender() {
				System.out.println("MALE");
				
			}
		};
		Employee empA = new Employee() {
			
			@Override
			public void gender() {
				System.out.println("MALE");
				
			}
		};
		
		empA.major();
		da.major();
		empA.eat();
		da.eat();
	}
	

}
