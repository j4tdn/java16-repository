package inheritance.fclass;

public class InheritanceClassDemo {
	public static void main(String[] args) {
		InheritanceParent parent = new InheritanceParent();
		parent.codingSkill();
		InheritanceParent child = new InheritanceChild();
		child.codingSkill();

		// InheritanceChild object = new InheritanceParent();
		// object.codingSkill();

		// Parent &child
		//

	}
}
