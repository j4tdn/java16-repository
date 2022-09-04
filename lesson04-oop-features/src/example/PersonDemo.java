package example;

public class PersonDemo {
	public static void main(String[] args) {
		Student stA = new Student() {
			
			@Override
			public void major() {
				System.out.println("MALE");

			}
		};
		stA.eat();
		Employee empB = new Employee() {
			@Override
			public void major() {
				System.out.println("MALE");

			}
		};
		empB.eat();
		
			
		/*	stA.eat();
			
		
		Employee empB = new Employee() {
			
			@Override
			public void major() {
				System.out.println("MALE");

			}
			
			@Override
			public void gender() {
				System.out.println("MALE");

			}
		};
		empB.eat();*/
	}
}
