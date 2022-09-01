package inheritance.multple;

public interface GrandFather {
	void smoking();
	default void adn() {
		System.out.println("abcxyz1234");
	}
}
