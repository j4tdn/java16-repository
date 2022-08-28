package inheritance.fclass;

public class InheritanceClassDemo {
	public static void main(String[] args) {
		// Parent: age, name, codingSkills
		// Child: age, name, codingSkills
		InheritanceParent parent = new InheritanceParent();
		parent.codingSkills();
		
		InheritanceParent child = new InheritanceParent();
		child.codingSkills();
		
		//InheritanceChild object = new InheritanceParent();
		//object.playingGmae();
		
		// Parent & Child
		// Parent p = new Child();
		//Parent p = new Parent();
		// Child c  new Parent
	}
}
