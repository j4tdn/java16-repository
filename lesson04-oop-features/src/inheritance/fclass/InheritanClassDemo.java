package inheritance.fclass;

public class InheritanClassDemo {
	public static void main(String[] args) {
		// Parent: age, name, codingSkills
		// Child: age, name, codingSkills, playingGame
		InheritanceParent parent = new InheritanceParent();
		parent.codingSkills();
		
		InheritanceChild child = new InheritanceChild();
		child.codingSkills();
		
		// Parent & Child
		// Parent p = new Child();
		// Parent p = new Parent();
		// Child c = new Parent(); not allowed
	}

}
