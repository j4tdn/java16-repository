package polymorphism.method;

public class Ex02OverridingChild extends Ex02OveridingParent {

	@Override
	void log() {
		super.log();
	}

	@Override
	public String toString() {

		return "child -->toString";
	}

}
