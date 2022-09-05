package example;

public abstract class Employee implements Person{
	@Override
	public void major() {
		System.out.println("EMPLOYEE");
	}
	@Override
	public void eat() {
		System.out.println("by mouth");
		
	}
}
