package inheritance.multiple;

public interface GrandFather {
	default void adn() {
		System.out.println("Grandpa adn");
	}
	void smoking();
}
