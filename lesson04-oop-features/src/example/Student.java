package example;

public abstract class Student implements Person {

	@Override
	public void major() {
		System.out.println("STUDENT");
	}

	@Override
	public void eat() {
		System.out.println("By mouth");
		
	}
}
