package pylymorphism.method;

public class Ex02OverridingDemo {
	public static void main(String[] args) {
		Ex02OverridingChild child = new Ex02OverridingChild();
		
		System.out.println("text: " +child.Text);
		child.log();
		
		System.out.println("toString:" + child.toString());
	}
}
