package inheritance.fclass;

public class InheritanceClassDemo {

	public static void main(String[] args) {
		//Parent: age, name, codingSkillds
		//CHild: age, name, codingSkillds, playingGame
		InheritanceParent parent =new InheritanceParent();
		parent.codingSkills();
		InheritanceParent child =new InheritanceChild();
		child.codingSkills();
		
		//InheritanceChild object = new InheritanceParent();
		
		
		
		// Parent vs child 
		// Parent p = new Child();
		// Parent p = new Parent();
		// Child c = new Parent(); // not allowed
		
	}

}
