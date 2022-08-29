package inheritance.multiple;

public class Dad implements GrandFather, GrandMother{
	void cooking() {
		System.out.println("Dad --> cooking");
	}
	
	void playSport() {
		System.out.println("Dad --> playSport");
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
		// phải chọn override 1 trong 2 interface Grandfather, Grandmother
		GrandMother.super.adn();
	}
}
