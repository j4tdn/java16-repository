package inheritance.multiple;

public class Dad implements GrandFather, GrandMa {
	void cooking() {
		System.out.println("Dad --> Cooking");
	}

	void playSport() {
		System.out.println("Dad -->playSport");
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
		// TODO Auto-generated method stub
		GrandFather.super.adn();
		GrandMa.super.adn();
	}
	
	public static void main(String[] args) {
		Dad dad = new Dad();
		dad.adn();
	}
	
}
