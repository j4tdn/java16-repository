package inheritance.multiple;

public interface GrandFather {
	void smoking();
	default void adn() {
		System.out.println("abcxyz123456789");
	}

}
