package example;

public interface Person {
	void gender();

	void major();

	default void eat() {
		System.out.println("By mouth");
	}
}
