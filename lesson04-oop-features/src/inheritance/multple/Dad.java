package inheritance.multple;
// Đa thực thi không đa thừa kế;
public class Dad implements GrandFather, GrandMother {
	void cooking() {
		System.out.println("Dad --> cooking bad");
	}
	@Override
	public void smoking() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void swimming() {
		// TODO Auto-generated method stub
		
	}
	void playSport() {
		System.out.println("Dad --> cooking");
	}
	@Override
	public void adn() {
		// TODO Auto-generated method stub
		GrandFather.super.adn();
		GrandMother.super.adn();
	}
	
	public static void main(String[] args) {
		Dad dad = new Dad();
		dad.adn();
	}
}
