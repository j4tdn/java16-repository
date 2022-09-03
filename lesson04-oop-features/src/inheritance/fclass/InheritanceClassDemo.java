package inheritance.fclass;

public class InheritanceClassDemo {
	public static void main(String[] args) {
		// Parent: age, name, codingSkills
		// Child: age, name, codingSkills, playingGame
		InheritanceParent parent = new InheritanceParent();
		parent.codingSkills();

		InheritanceParent child = new InheritanceChild();
		child.codingSkills();

		// Parent & Child
		// Patent p = new Child();
		// Parent p = new Parent();
		// Child c = new Parent(); // not allowed

	}
}
