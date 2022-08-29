package inheritance.fclass;

public class InheritanceDemo {
	public static void main(String[] args) {
		//parent: age, name, codingSkills
		//child: age, name, codingSkills
		InheritanceParent parent =new InheritanceParent();
		
		InheritanceParent child = new InheritanceChild();
		
		//InheritanceChild object = new InheritanceParent();
		
		
		
		// Parent vs child 
		// Parent p = new Child();
		// Parent p = new Parent();
		// Child c = new Parent(); // not allowed
		
		/*
		 * 1. Lớp con ( Square , Rectangle ) bắt buộc phải override phương thức draw , cals từ Shape 
			2. Hàm draw , cals bên trong Shape vô nghĩa nên mong muốn hàm draw , cals không có thân hàm 
  				+ Lớp còn phải override các hàm tù cha 
  				+ Hàm trong cha là hàm không có thân hàm 
    			== > Cha -- > interface
		 */
		
	}
}
