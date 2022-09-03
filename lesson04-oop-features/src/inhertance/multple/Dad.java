package inhertance.multple;

public class Dad implements GrandFather, GrandMother{
	void cooking() {
		System.out.println("Dad --> cooking");
	}
	
	void playSport() {
		System.out.println("Dad --> playSport");
	}

	@Override
	public void swim() {
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

	public static void main(String[] args) {
		Dad dad = new Dad();
		dad.adn();
	}
}
