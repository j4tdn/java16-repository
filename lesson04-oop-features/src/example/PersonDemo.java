package example;

public class PersonDemo {
	public static void main(String[] args) {
		Student stA = new Student() {
			public void gender() {
				System.out.println("Male");
			}
		};
		stA.eat();
		Employee epB = new Employee() {
			public void gender() {
				System.out.println("Male");
			}
		};
		epB.eat();
	}

}
