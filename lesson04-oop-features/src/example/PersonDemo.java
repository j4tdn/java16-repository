package example;

public class PersonDemo {
	public static void main(String[] args) {
		Student stA = new Student() {
			public void gender() {
				System.out.println("MALE");
			}
		};
		stA.eat();
		Employee empB = new Employee() {

			@Override
			public void gender() {
				System.out.println("MALE");
			}
		};
		stA.eat();
	}
	
}
