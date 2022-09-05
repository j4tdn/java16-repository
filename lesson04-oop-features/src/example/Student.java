package example;

public abstract class Student implements Person {
	@Override
	public void major() {
		System.out.println("Student");
	}

	@Override
	public void eat() {
		System.out.println("by mouth");

	}
}
