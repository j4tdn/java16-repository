package polymorphism.method;

public class Ex02OverridingDemo {
	public static void main(String[] args) {
		Ex02OverridingChild child = new Ex02OverridingChild();
		//child đang trỏ tới đối tượng nào thì nó sẽ vào hàm 
		//và thuộc tính non-static của đối tượng đó
		System.out.println("text: " + child.text);
		child.log();
		
		System.out.println("toString: " +child.toString());
	}

}
