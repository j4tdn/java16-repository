package polymorsphism.object;

public class Rectangle extends Shape{
	@Override
	void draw() {
		System.out.println("Retangle --> draw ...");
	}

	@Override
	void calS() {
		System.out.println("Retangle --> cal S ...");
	}
}
