package example;

public interface Person {
	void major();
	void gender();
	
	default void eat() {
		System.out.println("By mouth");
	}
}
