package inheritance.multple;

public class Dad implements GrandFather,GrandMother{
	void cooking() {
		System.out.println("dad cooking");
	}
	void playsport() {
		System.out.println("dad play sport");
	}
	public static void main(String[] args) {
		Dad dad = new Dad();
		dad.adn();
		
	}
	@Override
	public void swiming() {
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
		GrandMother.super.adn();
		
	}
	

}
