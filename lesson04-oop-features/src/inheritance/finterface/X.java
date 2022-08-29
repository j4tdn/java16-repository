package inheritance.finterface;

public class X implements Shape {
	@Override
	public void draw() {
		System.out.println("X --> draw ...");
	}

	@Override
	public void calS() {
		System.out.println("X --> cal S ...");
	}
}
