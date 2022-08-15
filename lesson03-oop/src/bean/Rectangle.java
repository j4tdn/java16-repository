package bean;

public class Rectangle {
	// attributes
	public int width;
	public int height;

	// empty/default
	public Rectangle() {

	}

	// constructure
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	// getters, setters
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return width + ", " + height;
	}

}
