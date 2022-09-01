package polymorphism.methods;

public class Ex02OverridingChild extends Ex02OverridingParent {
	
	String text = "hi";
	
	@Override
	void log() {
		System.out.println("child-->log");
		
	}
	
	@Override
	public String toString() {
		return "child-->toString";
	}

	
}
