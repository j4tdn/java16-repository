package inheritance.fclass;

public class InheritanceDemo {
	public static void main(String[] args) {
		//parent: age, name, codingSkills
		//Chidld: age, name, codingSkills, playinggame
		InheritanceParent parent = new InheritanceParent();
		parent.codingSkills();
		InheritanceChild child = new InheritanceChild();
		child.codingSkills();
		
		//Parent & child
		//Parent p = new Child();
		//parent p = new Parent();
		//Child c = new Parent();-->not allowed
}

}
