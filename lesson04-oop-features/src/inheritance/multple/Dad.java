package inheritance.multple;

public class Dad implements GrandFather, GrandMother{
	void cooking() {
		System.out.println("Dad --> cooking bad");
	}
	
	void playSport() {
		System.out.println("Dad --> playSport");
	}

	@Override
	public void swimming() {
		
	}

	@Override
	public void smoking() {
		
	}
	
	@Override
	public void adn() {
		GrandFather.super.adn();
		GrandMother.super.adn();
	}

	public static void main(String[] args) {
		Dad dad = new Dad();
		dad.adn();
	}

	
}
