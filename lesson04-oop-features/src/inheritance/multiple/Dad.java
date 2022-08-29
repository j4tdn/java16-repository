package inheritance.multiple;

public class Dad implements GrandFather, GrandMother {
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
		// TODO Auto-generated method stub
		GrandFather.super.adn();
		GrandMother.super.adn();
	}

	public static void main(String[] args) {
	}

	 
}
