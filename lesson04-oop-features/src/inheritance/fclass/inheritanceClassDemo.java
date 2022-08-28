package inheritance.fclass;

public class inheritanceClassDemo {
	public static void main(String[] args) {
		
		//Parent: age, name, codingSkills
		//child: age, name, codingSkills,playingGame
		inheritanceParent parent = new inheritanceParent();
		parent.codingSkills();
		
		inheritanceChild child = new inheritanceChild();
		child.codingSkills();
		
		//inheritanceChild object = new inheritanceParent();
		//object.playingGame();
		
		//Parent & Child()
		//Parent p =new Child();
		//Parent p= new Parent();
		//Child c =new Parent();//not allowed
	}

}
