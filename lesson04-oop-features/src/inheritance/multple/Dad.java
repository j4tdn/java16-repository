package inheritance.multple;

public class Dad implements GrandFather, GrandMother {
	void cooking() {
		System.out.println("Dad --> cooking bad");
	}

	void playSport() {
		System.out.println("Dad --> playSport");
	}

	public static void main(String[] args) {
		Dad dad = new Dad();
		dad.adn();
	}

	@Override
	public void swimming() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void smoking() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void adn() {
		GrandFather.super.adn();
		GrandMother.super.adn();
	}


}
