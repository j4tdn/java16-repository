package inheritance.fclass;

public class InheritanceClassDemo {
	public static void main(String[] args) {
		InheritanceParent parent = new InheritanceParent();
		parent.codingSkills();
		InheritanceParent child = new InheritanceChild();
		parent.codingSkills();
		// InheritanceChild object = new InheritanceParent();
		// object.playingGame();
	}
}
