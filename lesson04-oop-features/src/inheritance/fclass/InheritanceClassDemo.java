package inheritance.fclass;

public class InheritanceClassDemo {
	public static void main(String[] args) {
		//Parent: age, name, codingSkills
		//Child: age, name, codingSkills, playingGame
		InheritanceParent parent = new InheritanceParent();
		
		InheritanceParent child = new InheritanceChild();
		
		//parent a = new child
		//parent b = new parent
		// child c = new parent // not allowed
	}
}
