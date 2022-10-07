package inheritance.fclass;

public class InheritanceDemo {
	public static void main(String[] args) {
		// Parent: age, name, codingSkills
		// Child: age, name, codingSkills, playingGame
		InheritanceParent parent = new InheritanceParent();
		parent.codingSkills();

		InheritanceParent child = new InheritanceChild();
		child.codingSkills();

//		Child child = new Parent();//Not allowed
	}
}
