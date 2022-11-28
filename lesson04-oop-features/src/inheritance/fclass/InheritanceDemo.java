package inheritance.fclass;

public class InheritanceDemo {
	//parent: age, name, codingSkills
	//child: age, name, codingSkills
	InheritanceParent parent =new InheritanceParent();
	
	InheritanceParent child = new InheritanceChild();
	
	//InheritanceChild object = new InheritanceParent();
	
	
	
	// Parent vs child 
	// Parent p = new Child();
	// Parent p = new Parent();
	// Child c = new Parent(); // not allowed
}
