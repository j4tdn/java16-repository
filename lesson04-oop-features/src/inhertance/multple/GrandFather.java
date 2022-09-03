package inhertance.multple;

public interface GrandFather {
	void smoking();
	
	default void adn() {
		System.out.println("123456qwe");
	}
}
