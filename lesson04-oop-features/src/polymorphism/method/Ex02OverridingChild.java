package polymorphism.method;

public class Ex02OverridingChild extends Ex02OverridingParent {
	
	@Override
	void log() {
		System.out.println("Child -->log");
	}
	@Override
	public String toString() {
		return "child.toString()";
	}
}
