package inheritance.multiple;

public interface GrandMother {
    default void adn() {
        System.out.println("Grandmother ADN");
    }

    void swimming();
}
