package inheritance.fclass;

public class InheritanceClassDemo {
	public static void main(String[] args) {
		// Parent: age, name, codingSkills
		// Child: age, name, codingSkills, playingGame
		InheritanceParent parent = new InheritanceParent();
		parent.codingSkills();
		
		InheritanceParent child = new InheritanceChild();
		child.codingSkills();
		
		// InheritanceChild object = new InheritanceParent();
		// object.playingGame();
		
		// Parent & Child
		// Parent p = new Child();
		// Parent p = new Parent();
		// Child c = new Parent(); // not allowed
	}
}
