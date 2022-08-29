package molymorphism.method;

public class Ex02OverridingChild extends Ex02OverridingParent{
	
	@Override
	void log() {
		super.log();
	}
	
	@Override
	public String toString() {
		return "child --> tostring";
	}

}
