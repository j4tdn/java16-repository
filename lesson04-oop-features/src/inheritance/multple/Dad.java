package inheritance.multple;

public class Dad implements GrandFather {
	void cooking() {
		System.out.println("Dad --> cooking");
	}

	void playSport() {
		System.out.println("Dad --> playSport");
	}
@Override
public void smoking() {
	
}
	
@Override
public void adn() {
	GrandFather.super.adn();
}
	
	public static void main(String[] args) {
		Dad dad = new Dad();
		dad.adn();
	}


}
